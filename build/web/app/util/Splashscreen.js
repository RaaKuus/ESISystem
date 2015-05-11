Ext.define('ESISystem.util.Splashscreen', {
    
    mixins: {
        observable: 'Ext.util.Observable'
    },
    
    constructor: function(config){
        this.mixins.observable.constructor.call(this, config);
    },
    
    init: function(){
        var me = this;
        me.splashscreen = Ext.getBody().mask('Carregando...', 'splashscreen');
    },
    
    fadeOut: function(time){
        var me = this;
        var task = new Ext.util.DelayedTask(function(){
            me.splashscreen.fadeOut({
                duration: 1000,
                remove: true
            });
            me.splashscreen.next().fadeOut({
               duration: 1000,
               remove: true,
               listeners: {
                   afteranimate: function(el, startTime, eOpts){
                       me.fireEvent('afteranimate');
                   }
               }
            });
        });
        me.fireEvent('loading', 'Splashscreen');
        task.delay(time);
    }
});

