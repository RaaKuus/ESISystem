Ext.Loader.setConfig({
    enabled: true,
    paths: {
        "ESISystem": "app"
    }
});

Ext.require([
    //Ext.js
    "Ext.app.Application",
    "Ext.layout.container.Border",
    "Ext.form.Panel",
    "Ext.layout.container.Form",
    "Ext.form.FieldSet",
    "Ext.form.RadioGroup",
    "Ext.form.field.Radio",
    "Ext.form.field.Number",
    "Ext.form.field.Date",
    "Ext.form.field.ComboBox",
    "Ext.data.Model",
    "Ext.data.Store",
    "Ext.util.FocusableContainer",
    "Ext.button.Segmented",
    "Ext.layout.container.SegmentedButton",
    "Ext.tree.Panel",
    "Ext.data.TreeStore",
    "Ext.data.TreeModel",
    
    //Model
    //"ESISystem.model.Estado",
    "ESISystem.model.MatriculaModel",
    
    //Store
    //"ESISystem.store.EstadoStore",
    "ESISystem.store.MatriculaStore",
    "ESISystem.store.NavTreeStore",
    
    //Utils
    "ESISystem.util.MatriculaUtil",
    "ESISystem.util.GerenciamentoPainel",
    "ESISystem.util.nav.ContentBodyLoader",
    "ESISystem.util.nav.ContentBodyManager",
    "ESISystem.util.nav.ContentBodyFactory",
    "ESISystem.util.nav.ContentBody",
    "ESISystem.util.nav.PanelContentBody",
    "ESISystem.util.nav.WindowContentBody",
    
    //View
    "ESISystem.view.Main",
    "ESISystem.view.Navegacao",
    "ESISystem.view.MainPanel",
    "ESISystem.view.CadastrarMatricula",
    "ESISystem.view.ListarMatriculas",
    "ESISystem.view.AnoLetivoPanel",
    "ESISystem.view.CadastrarAnoLetivo",
    "ESISystem.view.NavTreePanel"
   
]);

Ext.onReady(function () {
    //Tab Panel - Painel principal
    var mainPanel = Ext.create("ESISystem.view.MainPanel");
   
    //Arvore de Navegação
    var nav = Ext.create("ESISystem.view.Navegacao");
    var navTreePanel = Ext.create("ESISystem.view.NavTreePanel");
    nav.add(navTreePanel);
    
    //ContentBody
    var contentBodyLoader = ESISystem.util.nav.ContentBodyLoader;
    
    contentBodyLoader.add({
       name: "Cadastrar Matricula",
       path: "ESISystem.view.CadastrarMatricula",
       initial: true,
       type: "panel"
    });
    
    contentBodyLoader.add({
       name: "Listar Matriculas",
       path: "ESISystem.view.ListarMatriculas",
       initial: false,
       type: "panel"
    });
    contentBodyLoader.initialize(mainPanel);
    
    var main = Ext.create("ESISystem.view.Main");
    main.add(nav);
    main.add(mainPanel);
    main.show();
    
});


Array.prototype.remove = function(from, to) {
    var rest = this.slice((to || from) + 1 || this.length);
    this.length = from < 0 ? this.length + from : from;
    return this.push.apply(this, rest);
};


