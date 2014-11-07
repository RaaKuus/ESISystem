Ext.define("ESISystem.util.MatriculaStore", {
   singleton: true,
   createModel: function(obj){
       return Ext.create("ESISystem.model.MatriculaModel",{
           matricula: (obj.matricula ? obj.matricula : "1"),
           nome: (obj.nome ? obj.nome : "Bruno"),
           sexo: (obj.sexo ? obj.sexo : "1"),
           dataNascimento: (obj.dataNascimento? obj.dataNascimento : "11"),
           naturalidade: (obj.naturalidade ? obj.naturalidade : "Brasilia"),
           endereco: (obj.endereco ? obj.endereco : "Qd 01"),
           nomePai: (obj.nomePai ? obj.nomePai : "Raimundo"),
           identidadePai: (obj.identidadePai ? obj.identidadePai : "000.000.000-00"),
           nomeMae: (obj.nomeMae ? obj.nomeMae : "Jocelina"),
           identidadeMae: (obj.identidadeMae ? obj.identidadeMae : "000.000.000-00"),
           cor: (obj.cor ? obj.cor : "1"),
           dataMatricula: (obj.dataMatricula ? obj.dataMatricula : "223"),
           
           visual: (obj.visual ? obj.visual : "1"),
           auditiva: (obj.auditiva ? obj.auditiva : "1"),
           fisica: (obj.fisica ? obj.fisica : "1"),
           mental: (obj.mental ? obj.mental : "1"),
           multipla: (obj.multipla ? obj.multipla : "1"),
           altasHabilidades: (obj.altasHabilidades ? obj.altasHabilidades : "1"),
           condutasTipicas: (obj.condutasTipicas ? obj.condutasTipicas : "1"),
           outra : (obj.outra ? obj.outra : "1"),
           
           vacinas: (obj.vacinas ? obj.vacinas : "1"),
           alergica: (obj.alergica ? obj.alergica : "1"),
           alergias: (obj.alergias ? obj.alergias : "1"),
           remedioControlado: (obj.remedioControlado ? obj.remedioControlado : "1"),
           remedioIndicado: (obj.remedioIndicado ? obj.remedioIndicado : "1"),
           febre: (obj.febre ? obj.febre : "1"),
           remedioFebre: (obj.remedioFebre ? obj.remedioFebre : "1"),
           
           observacoes: (obj.observacoes ? obj.observacoes : "1")
           
       });
   },
   getMatriculaStore : function(){
       return (this.matriculaStore === null ? this.createMatriculaStore() : this.matriculaStore);
   },
   
   matriculaStore: null,
   
   createMatriculaStore : function(){
       this.matriculaStore = Ext.create("ESISystem.store.MatriculaStore");
       return this.matriculaStore;
   }
});