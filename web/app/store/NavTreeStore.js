Ext.define("ESISystem.store.NavTreeStore", {
    extend: 'Ext.data.TreeStore',
    xtype: 'navtreestore',
    root: {
        expanded: true,
        children: [
            {
                text:'Secretaria', sub: false, children: [
                    {text: 'Cadastrar Matricula', leaf: true, sub: true},
                    {text: 'Listar Matriculas', leaf: true, sub: true}
                ]
            }
        ]
    }
    
});