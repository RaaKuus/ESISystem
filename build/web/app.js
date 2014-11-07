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
    //Model
    "ESISystem.model.Estado",
    "ESISystem.model.MatriculaModel",
    //Store
    "ESISystem.store.EstadoStore",
    "ESISystem.store.MatriculaStore",
    
    "ESISystem.util.MatriculaStore"

    //Utils
]);

Ext.onReady(function () {
    var main = Ext.create("ESISystem.view.Main");
    
    var nav = Ext.create("ESISystem.view.Navegacao");
    
    var matricula = Ext.create("ESISystem.view.MatriculaPanel");
    var util = ESISystem.util.MatriculaStore;
    console.log(util);
    
    
    main.add(matricula);
    main.add(nav);
    main.show();
});



