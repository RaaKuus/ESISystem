Ext.define("ESISystem.util.ViewFactory", {
    alias: 'widget.viewfactory',
    
    permissions: null,
    mainPanel: null,
    nav: null,
    navTreePanel: null,
    mainWindow: null,
    
    constructor: function(config){
        this.validarConfig(config);
        Ext.apply(this, config);
    },
    
    validarConfig: function(config){
        this.validarPermissions(config);
    },
    
    validarPermissions: function(config){
        var temPermissions = typeof config.permissions !== 'undefined';
        if(!temPermissions){
            throw "[ViewFactory] permissions is not defined!";
        }
    },
    
    init: function(){
        this.initialize();
        this.integrate();
    },
    
    initialize: function(){
        this.initializeViews();
    },
    
    initializeViews: function(){
        this.mainPanel = Ext.create("ESISystem.view.MainPanel");
        this.nav = Ext.create("ESISystem.view.Navegacao");
        this.mainWindow = Ext.create("ESISystem.view.Main");
    },
    
    initializeNavTreeModel: function(){
        this.navTreePanel = Ext.create("ESISystem.view.NavTreePanel");
    },
    
    integrate: function(){
        this.mainWindow.add(this.nav);
        this.mainWindow.add(this.mainPanel);
    },
    
    show: function(){
        this.mainWindow.show();
    }
    
});

