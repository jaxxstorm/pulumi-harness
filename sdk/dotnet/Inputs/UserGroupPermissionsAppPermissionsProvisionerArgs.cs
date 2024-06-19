// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupPermissionsAppPermissionsProvisionerArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<string>? _actions;

        /// <summary>
        /// The actions allowed to be performed. Valid options are CREATE, READ, UPDATE, DELETE
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("appIds")]
        private InputList<string>? _appIds;

        /// <summary>
        /// The application IDs to which the permission applies. Leave empty to apply to all applications.
        /// </summary>
        public InputList<string> AppIds
        {
            get => _appIds ?? (_appIds = new InputList<string>());
            set => _appIds = value;
        }

        [Input("provisionerIds")]
        private InputList<string>? _provisionerIds;

        /// <summary>
        /// The provisioner IDs to which the permission applies. Leave empty to apply to all provisioners.
        /// </summary>
        public InputList<string> ProvisionerIds
        {
            get => _provisionerIds ?? (_provisionerIds = new InputList<string>());
            set => _provisionerIds = value;
        }

        public UserGroupPermissionsAppPermissionsProvisionerArgs()
        {
        }
        public static new UserGroupPermissionsAppPermissionsProvisionerArgs Empty => new UserGroupPermissionsAppPermissionsProvisionerArgs();
    }
}
