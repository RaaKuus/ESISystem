Ext.define("ESISystem.model.CondicoesSaude", {
    extend: "Ext.data.Model",
    xtype: 'condicoessaude',
    
    fields: [
        {name: 'vacinas', type: 'int'},
        {name: 'alergica', type: 'int'},
        {name: 'alergias', type: 'string'},
        {name: 'remedioControlado', type: 'int'},
        {name: 'remedioIndicado', type: 'int'},
        {name: 'febre', type: 'int'},
        {name: 'remedioFebre', type: 'string'}
    ]
});

