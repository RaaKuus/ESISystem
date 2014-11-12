Ext.define("ESISystem.view.Main", {
	extend: "Ext.window.Window",
        alias: 'widget.mainwindow',
	title: 'Escola Santa Izabel - Sistema Escolar',
	header: {
		titlePosition: 2,
		titleAlign: 'center'
	},
	closable: false,
	minWidth: 500,
	height: 500,
	width: 800,
	maximizable: true,
	autoScroll: "true",
	bodyPadding: 10,
	constrain: true,
	tools: [{type: 'pin'}],
	layout: {
		type: 'border',
		padding: 5
	},
        initComponent: function(){
            //console.log("--Main--");
            
            this.callParent(arguments);
        }
});