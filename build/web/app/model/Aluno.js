Ext.define("ESISystem.model.Aluno", {
    extend: 'Ext.data.Model',
    xtype: 'aluno',
    filds: [
        {name: 'matricula', type: 'int'},
        {name: 'nome', type: 'string'},
        {name: 'sexo', type: 'int'},
        {name: 'dataNascimento'},
        {name: 'naturalidade', type: 'string'},
        {name: 'endereco', type: 'string'},
        {name: 'nomePai', type: 'string'},
        {name: 'identidadePai', type: 'string'},
        {name: 'nomeMae', type: 'string'},
        {name: 'identidadeMae', type: 'string'},
        {name: 'cor', type: 'int'},
        {name: 'dataMatricula'}
    ]
});

