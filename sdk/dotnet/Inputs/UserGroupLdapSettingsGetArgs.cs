// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupLdapSettingsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The group DN of the LDAP user group.
        /// </summary>
        [Input("groupDn")]
        public Input<string>? GroupDn { get; set; }

        /// <summary>
        /// The group name of the LDAP user group.
        /// </summary>
        [Input("groupName")]
        public Input<string>? GroupName { get; set; }

        /// <summary>
        /// The ID of the SSO provider.
        /// </summary>
        [Input("ssoProviderId")]
        public Input<string>? SsoProviderId { get; set; }

        public UserGroupLdapSettingsGetArgs()
        {
        }
        public static new UserGroupLdapSettingsGetArgs Empty => new UserGroupLdapSettingsGetArgs();
    }
}