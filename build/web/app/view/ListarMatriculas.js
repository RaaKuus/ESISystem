Ext.define("ESISystem.view.ListarMatriculas", {
    extend: 'Ext.grid.Panel',
    title: 'Listar Matriculas',
    autoScroll: true,
    initComponent: function(){
        var store = ESISystem.util.MatriculaUtil.getMatriculaStore();
        Ext.apply(this, {
            store: store,
            columns: [
                {text: 'Matricula', dataIndex: 'matricula'},
                {text: 'Nome', dataIndex: 'nome', flex: 1},
                {text: 'Data de Matricula', dataIndex: 'dataMatricula', flex: 1}
            ],
            dockedItems: [
                {                    xtype: 'pagingtoolbar',
                    store: 'matriculaStore',
                    dock: 'bottom',
                    displayInfo: true
                }
            ]
        });
        this.callParent(arguments);
    }
    
});