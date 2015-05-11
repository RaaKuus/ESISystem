Ext.define("ESISystem.util.permissions.PermissionHandler", {
	singleton: true,
	permissions: [],
	addPermission: function(permission){
		this.permissions.push(permission);
	},
	hasPermission: function(permission){
		for(var i = 0; i < this.permissions.length; i++){
			if(this.permissions[i] === permission) {
                            return true;
                        }
		}
		return false;
	},
	getPermissions: function(){
		return this.permissions.clone();
	}
});
