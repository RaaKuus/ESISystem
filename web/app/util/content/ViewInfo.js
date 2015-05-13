Ext.define("ESISystem.util.content.ViewInfo", {
    alias: 'widget.viewinfo',
    
    config: {
        name: '',
        path: '',
        initial: false,
        type: 'panel'
    },
    
    constructor: function(config){
        this.validarConfig(config);
        this.initConfig(config);
    },
    
    validarConfig: function(config){
        this.validarName(config);
        this.validarPath(config);
    },
    
    validarName: function(config){
        var temName = typeof config.name !== 'undefined';
        if(!temName){
            throw "[ViewInfo] o atributo name eh obrigatório!";
        }
    },
    
    validarPath: function(config){
        var temPath = typeof config.path !== 'undefined';
        if(!temPath){
            throw "[ViewInfo] o atributo path eh obrigatório!";
        }
    },
    
    applyInitial: function(initial){
        var booleano = typeof initial === 'boolean';
        if(!booleano){
            throw "[ViewInfo] o valor do atributo initial deve ser booleano!";
        }
    },
    
    applyType: function(type){
        var panelOrWindow = type === 'panel' || type === 'window';
        if(!panelOrWindow){
            throw "[ViewInfo] o valor type está incorreto, deve ser 'type' ou 'window'";
        }
    }
});


