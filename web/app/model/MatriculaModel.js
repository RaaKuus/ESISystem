Ext.define("ESISystem.model.MatriculaModel", {
    extend: "Ext.data.Model",
    xtype: "matriculamodel",
    
    fields:[
        {name:"matricula",              type: "int"},
        {name:"nomeAluno",              type: "string"},
        {name:"sexo",                   type:"int"},
        {name:"dataNascimento",         type:"string"},
        {name:"naturalidade",           type:"string"},
        {name:"endereco",               type:"string"},
        {name:"nomePai",                type: "string"},
        {name:"identidadePai",          type:"string"},
        {name:"nomeMae",                type:"string"},
        {name:"identidadeMae",          type:"string"},
        {name:"cor",                    type:"int"},
        {name:"visual",                 type:"int"},
        {name:"auditiva",               type:"int"},
        {name:"fisica",                 type:"int"},
        {name:"mental",                 type:"int"},
        {name:"multipla",               type:"int"},
        {name:"altasHabilidades",       type:"int"},
        {name:"condutasTipicas",        type:"int"},
        {name:"outra",                  type:"int"},
        {name:"vacinas",                type:"int"},
        {name:"alergica",               type:"int"},
        {name:"alergiasIndicadas",      type:"string"},
        {name:"remedioControlado",      type:"int"},
        {name:"qualRemedioControlado",  type:"string"},
        {name:"observacoes",            type:"string"}
    ]
    
});

