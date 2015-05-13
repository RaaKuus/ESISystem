Ext.define("ESISystem.util.content.ViewInfoRepository", {
    alias: 'widget.viewinforepository',
    
    requires: [
        "ESISystem.util.content.ViewInfo"
    ],
    
    views: [],
    
    addViewInfo: function(viewInfo){
        this.validateViewInfo(viewInfo);
        this.views.push(viewInfo);
    },
    
    addViews: function(views){
        this.validateViews(views);
        for(var viewInfo in views){
            this.addView(viewInfo);
        }
    },
    
    validateViews: function(views){
        var isArray = views instanceof Array;
        if(!isArray){
            throw "[ViewInfoRepository] views must be array!";
        }
    },
    
    validateViewInfo: function(viewInfo){
        if(!this.isViewInfo(viewInfo)){
            throw "[ViewInfoRepository] argumento inválido!";
        }
    },
    
    isViewInfo: function(viewInfo){
        return viewInfo instanceof ESISystem.util.content.ViewInfo;
    }
    
});

