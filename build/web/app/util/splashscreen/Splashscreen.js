Ext.define('ESISystem.util.splashscreen.Splashscreen', {
    duration: 1000,
    fadeOutTime: 2000,
    maskMessage: 'MaskMessage is not defined!',
    delay: 100,
    after: function(){
        throw "[Splashscreen] after function is not defined!";
    },
    
    loading: function(){
        throw "[Splashscreen] loading function is no defined!";
    },
    
    constructor: function(config){
        this.validarConfig(config);
        Ext.apply(this, config);
        this.init();
    },
    
    validarConfig: function(config){
        var temAfter = typeof config.after !== 'undefined';
        var afterEhFuncao = typeof config.after === 'function';
        if(temAfter && !afterEhFuncao){
            throw "[Splashscreen] after deve ser uma função";
        }
        
        var temLoading = typeof config.loading !== 'undefined';
        var loadingEhFuncao = typeof config.loading === 'function';
        if(temLoading && !loadingEhFuncao){
            throw "[Splashscreen] loading deve ser uma função";
        }
    },
    
    init: function(){
        var me = this;
        var task = new Ext.util.DelayedTask(function(){
            me.splashscreen = Ext.getBody().mask(me.maskMessage, 'splashscreen');
        });
        console.log(this.delay);
        task.delay(this.delay);
        
    },
    
    fadeOut: function(){
        var me = this;
        var task = new Ext.util.DelayedTask(function(){
            try {
                me.splashscreen.fadeOut({
                    duration: me.duration,
                    remove: true
                });
                me.splashscreen.next().fadeOut({
                   duration: me.duration,
                   remove: true,
                   listeners: {
                       afteranimate: function(el, startTime, eOpts){
                           me.after();
                       }
                   }
                });
            }catch(e){
                //Importa com isso não... parte pra outra coisa kkkk
            }
        });
        me.loading();
        task.delay(me.fadeOutTime);
    }
});

