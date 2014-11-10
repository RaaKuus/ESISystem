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
    //View
    'ESISystem.view.Main',
    "ESISystem.view.Navegacao",
    "ESISystem.view.MatriculaPanel",
    "ESISystem.view.CadastrarMatricula",
    "ESISystem.view.WindowTeste",
    //Model
    "ESISystem.model.Estado",
    "ESISystem.model.MatriculaModel",
    //Store
    "ESISystem.store.EstadoStore",
    "ESISystem.store.MatriculaStore",
    
    "ESISystem.util.MatriculaStore",

    //Ux
    "ESISystem.ux.panel.PDF",
    "ESISystem.ux.util.PDF.TextLayerBuilder"
]);

Ext.onReady(function () {
    var main = Ext.create("ESISystem.view.Main");
    
    var nav = Ext.create("ESISystem.view.Navegacao");
    
    var matricula = Ext.create("ESISystem.view.MatriculaPanel");
    var util = ESISystem.util.MatriculaStore;
    
    
    main.add(matricula);
    main.add(nav);
    main.show();
    
    var windowTeste = Ext.create("ESISystem.view.WindowTeste");
    windowTeste.show();
});



