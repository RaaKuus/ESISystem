Ext.define("ESISystem.model.MatriculaModel", {
    extend: "Ext.data.Model",
    xtype: "matriculamodel",
    fields: [
        'matricula',
        'nome',
        'sexo',
        'dataNascimento',
        'naturalidade',
        'endereco',
        'nomePai',
        'identidadePai',
        'nomeMae',
        'identidadeMae',
        'cor',
        'dataMatricula',
        
        'visual',
        'auditiva',
        'fisica',
        'mental',
        'multipla',
        'altasHabilidades',
        'condutasTipicas',
        'outra',
        
        'vacinas',
        'alergica',
        'alergias',
        'remedioControlado',
        'remedioIndicado',
        'febre',
        'remedioFebre',
        
        'observacoes'
    ]
    
});

