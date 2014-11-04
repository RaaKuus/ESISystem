Ext.define("ESISystem.view.Main", {
	extend: "Ext.window.Window",
	title: 'Sistema Escolar - Escola Santa Izabel',
	header: {
		titlePosition: 2,
		titleAlign: 'center'
	},
	closeable: false,
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
	items: [{xtype: 'nav-west'},
	        {xtype: 'matricula'}]
});