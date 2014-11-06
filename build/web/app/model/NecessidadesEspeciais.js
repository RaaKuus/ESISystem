Ext.define("ESISystem.model.NecessidadesEspeciais", {
    extend: "Ext.data.Model",
    xtype: 'necessidadesespeciais',
    
    fields: [
        {nome: 'visual', type: 'int'},
        {nome: 'auditiva', type: 'int'},
        {nome: 'mental', type: 'int'},
        {nome: 'multipla', type: 'int'},
        {nome: 'altasHabilidades', type: 'int'},
        {nome: 'condutasTipicas', type: 'int'},
        {nome: 'outra', type: 'int'}
    ]
});

