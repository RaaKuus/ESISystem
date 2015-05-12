Ext.define("ESISystem.util.splashscreen.ComponentSplashscreen", {
    extend: "ESISystem.util.splashscreen.Splashscreen",
    alias: 'widget.componentsplashscreen',
    fadeOutTime: 1000,
    
    constructor: function(config){
        this.validarConfig(config);
        this.callParent([config]);
    },
    
    validarConfig: function(config){
        var temComponente = typeof config.componente !== 'undefined';
        if(!temComponente){
            throw "[ComponentSplashscreen] componente is not defined!";
        }
    },
    
    init: function(){
        console.log("chamou o metodo init boladao");
        this.splashscreen = this.componente.el;
    },
    
    after: function(){
        console.log("[ComponentSplashscreen] componente sumiu!");
    },
    
    loading: function(){
        console.log("[ComponentSplashscreen] componente desaparecendo...");
    }
});