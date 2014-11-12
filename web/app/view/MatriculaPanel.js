Ext.define("ESISystem.view.MatriculaPanel", {
    extend: "Ext.tab.Panel",
    xtype: 'matricula',
    region: 'center',
    initComponent: function () {
        var cadastrarMatriculas = Ext.create("ESISystem.view.CadastrarMatricula");
        var listarMatriculas = Ext.create("ESISystem.view.ListarMatriculas");
        Ext.apply(this, {
           items:[
               cadastrarMatriculas,
               listarMatriculas
           ] 
        });
        
        
        this.callParent(arguments);
    }
});