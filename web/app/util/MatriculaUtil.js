Ext.define("ESISystem.util.MatriculaUtil", {
   singleton: true,
   createModel: function(obj){
       return Ext.create("ESISystem.model.MatriculaModel",{
           matricula: (obj.matricula ? obj.matricula : ""),
           nome: (obj.nome ? obj.nome : ""),
           sexo: (obj.sexo ? obj.sexo : ""),
           dataNascimento: (obj.dataNascimento? obj.dataNascimento : ""),
           naturalidade: (obj.naturalidade ? obj.naturalidade : ""),
           endereco: (obj.endereco ? obj.endereco : ""),
           nomePai: (obj.nomePai ? obj.nomePai : ""),
           identidadePai: (obj.identidadePai ? obj.identidadePai : ""),
           nomeMae: (obj.nomeMae ? obj.nomeMae : ""),
           identidadeMae: (obj.identidadeMae ? obj.identidadeMae : ""),
           cor: (obj.cor ? obj.cor : ""),
           dataMatricula: (obj.dataMatricula ? obj.dataMatricula : ""),
           
           visual: (obj.visual ? obj.visual : ""),
           auditiva: (obj.auditiva ? obj.auditiva : ""),
           fisica: (obj.fisica ? obj.fisica : ""),
           mental: (obj.mental ? obj.mental : ""),
           multipla: (obj.multipla ? obj.multipla : ""),
           altasHabilidades: (obj.altasHabilidades ? obj.altasHabilidades : ""),
           condutasTipicas: (obj.condutasTipicas ? obj.condutasTipicas : ""),
           outra : (obj.outra ? obj.outra : ""),
           
           vacinas: (obj.vacinas ? obj.vacinas : ""),
           alergica: (obj.alergica ? obj.alergica : ""),
           alergias: (obj.alergias ? obj.alergias : ""),
           remedioControlado: (obj.remedioControlado ? obj.remedioControlado : ""),
           remedioIndicado: (obj.remedioIndicado ? obj.remedioIndicado : ""),
           febre: (obj.febre ? obj.febre : ""),
           remedioFebre: (obj.remedioFebre ? obj.remedioFebre : ""),
           
           observacoes: (obj.observacoes ? obj.observacoes : "")
           
       });
   },
   
   createData: function(obj){
       return {
           matricula: (obj.matricula ? obj.matricula : ""),
           nome: (obj.nome ? obj.nome : ""),
           sexo: (obj.sexo ? obj.sexo : ""),
           dataNascimento: (obj.dataNascimento? obj.dataNascimento : ""),
           naturalidade: (obj.naturalidade ? obj.naturalidade : ""),
           endereco: (obj.endereco ? obj.endereco : ""),
           nomePai: (obj.nomePai ? obj.nomePai : ""),
           identidadePai: (obj.identidadePai ? obj.identidadePai : ""),
           nomeMae: (obj.nomeMae ? obj.nomeMae : ""),
           identidadeMae: (obj.identidadeMae ? obj.identidadeMae : ""),
           cor: (obj.cor ? obj.cor : ""),
           dataMatricula: (obj.dataMatricula ? obj.dataMatricula : ""),
           
           visual: (obj.visual ? obj.visual : ""),
           auditiva: (obj.auditiva ? obj.auditiva : ""),
           fisica: (obj.fisica ? obj.fisica : ""),
           mental: (obj.mental ? obj.mental : ""),
           multipla: (obj.multipla ? obj.multipla : ""),
           altasHabilidades: (obj.altasHabilidades ? obj.altasHabilidades : ""),
           condutasTipicas: (obj.condutasTipicas ? obj.condutasTipicas : ""),
           outra : (obj.outra ? obj.outra : ""),
           
           vacinas: (obj.vacinas ? obj.vacinas : ""),
           alergica: (obj.alergica ? obj.alergica : ""),
           alergias: (obj.alergias ? obj.alergias : ""),
           remedioControlado: (obj.remedioControlado ? obj.remedioControlado : ""),
           remedioIndicado: (obj.remedioIndicado ? obj.remedioIndicado : ""),
           febre: (obj.febre ? obj.febre : ""),
           remedioFebre: (obj.remedioFebre ? obj.remedioFebre : ""),
           
           observacoes: (obj.observacoes ? obj.observacoes : "")
       };
   },
   getMatriculaStore : function(){
       var store =  (this.matriculaStore === null ? this.createMatriculaStore() : this.matriculaStore);
       return store;
   },
   
   matriculaStore: null,
   
   createMatriculaStore : function(){
       this.matriculaStore = Ext.create("ESISystem.store.MatriculaStore");
       return this.matriculaStore;
   }
});