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
    
    //Model
    //"ESISystem.model.Estado",
    "ESISystem.model.MatriculaModel",
    
    //Store
    //"ESISystem.store.EstadoStore",
    "ESISystem.store.MatriculaStore",
    
    //Utils
    "ESISystem.util.MatriculaUtil",
    
    //View
    'ESISystem.view.Main',
    "ESISystem.view.Navegacao",
    "ESISystem.view.MatriculaPanel",
    "ESISystem.view.CadastrarMatricula",
    "ESISystem.view.ListarMatriculas",
    "ESISystem.view.AnoLetivoPanel",
    "ESISystem.view.CadastrarAnoLetivo",
    
    //"ESISystem.view.WindowTeste",
    
    //Ux
    "ESISystem.ux.panel.PDF",
    "ESISystem.ux.util.PDF.TextLayerBuilder"
]);

Ext.onReady(function () {
    //console.log("---");
    var main = Ext.create("ESISystem.view.Main");
    
    //console.log("São iguais?" + (store1 === store2));
    //console.log(store1);
    var nav = Ext.create("ESISystem.view.Navegacao");
    
    var matricula = Ext.create("ESISystem.view.MatriculaPanel");
    
    main.add(matricula);
    main.add(nav);
    main.show();
    
    var anoletivo = Ext.create("ESISystem.view.AnoLetivoPanel");
    anoletivo.show();
   // var windowTeste = Ext.create("ESISystem.view.WindowTeste");
   // windowTeste.show();
});



