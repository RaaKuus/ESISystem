Ext.define("ESISystem.view.ListarMatriculas", {
    extend: 'Ext.grid.Panel',
    title: 'Listar Matriculas',
    autoScroll: true,
    store: ESISystem.util.MatriculaStore.getMatriculaStore(),
    columns: [
        {text: 'Matricula', dataIndex: 'matricula'},
        {text: 'Nome', dataIndex: 'Nome'},
        {text: 'Data de Matricula', dataIndex: 'dataMatricula'}
    ]
});