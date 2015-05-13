var initWindow = function(){
    Ext.create("Ext.window.Window", {
        
    }).show();
};


Ext.application({
    name: 'ESISystem',
    requires: [
        "ESISystem.util.ViewFactory",
        "ESISystem.util.content.ViewInfo",
        "ESISystem.util.content.ViewInfoRepository"
    ],
    launch: function(){
        
        
        var viewInfo = Ext.widget("viewinfo", {
            path: 'Cachorro',
            initial: true,
            type: true
        });
        
        var viewInfoRepository = Ext.widget("viewinforepository");
        viewInfoRepository.addViewInfo(viewInfo);
        
        console.log(viewInfoRepository);
        console.log(viewInfo.getName());
        console.log(viewInfo instanceof ESISystem.util.content.ViewInfo);
    },
    init: function(){
        
    }
});