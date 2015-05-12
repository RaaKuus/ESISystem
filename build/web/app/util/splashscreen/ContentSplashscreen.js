Ext.define("ESISystem.util.splashscreen.ContentSplashscreen", {
    extend: 'ESISystem.util.splashscreen.Splashscreen',
    alias: 'widget.contentsplashscreen',
    requires: [
        
    ],
    delay: 1500,
    maskMessage: 'Aguarde, iniciando aplicação...',
    permissions: null,
    
    constructor: function(config){
        this.validarConfig(config);
        this.callParent([config]);
    },
    validarConfig: function(config){
        var temPermissions = typeof config.permissions !== 'undefined';
        if(!temPermissions){
            throw "[Splashscreen] permissions is not defined!";
        }
    },
    after: function(){
        
    },
    loading: function(){
        
    }
    
});