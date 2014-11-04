Ext.Loader.setConfig({
	enabled: true,
	paths: {
	        "ESISystem" : "app"
	}
});

//Não tá funfando o mvc automatico por que estou fazendo a parte principal com uma Window, 
//a Viewport não aceita window como filha, só panel, e não quero fazer uma janela estática...

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
             
             //Model
             "ESISystem.model.Estado",
	         
	         //Store
	         "ESISystem.store.EstadoStore"
             
]);

Ext.onReady(function(){
	
	var main = Ext.create("ESISystem.view.Main");
	main.show();
});

