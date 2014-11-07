Ext.define("ESISystem.store.EstadoStore", {
	extend: 'Ext.data.Store',
	model: 'ESISystem.model.Estado',
	alias: 'store.estados',
	proxy: {type: 'ajax', url: "resources/estados.json", reader: {type: 'json', rootProperty: 'estados'}},
	autoLoad: true
});