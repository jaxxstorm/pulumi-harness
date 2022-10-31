// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness
{
    /// <summary>
    /// Resource for creating a Harness user group
    /// 
    /// ## Import
    /// 
    /// Import using the id of the user group
    /// 
    /// ```sh
    ///  $ pulumi import harness:index/userGroup:UserGroup example &lt;USER_GROUP_ID&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:index/userGroup:UserGroup")]
    public partial class UserGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the user group.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the user group was imported by SCIM.
        /// </summary>
        [Output("importedByScim")]
        public Output<bool> ImportedByScim { get; private set; } = null!;

        /// <summary>
        /// Indicates whether the user group is linked to an SSO provider.
        /// </summary>
        [Output("isSsoLinked")]
        public Output<bool> IsSsoLinked { get; private set; } = null!;

        /// <summary>
        /// The LDAP settings for the user group.
        /// </summary>
        [Output("ldapSettings")]
        public Output<Outputs.UserGroupLdapSettings?> LdapSettings { get; private set; } = null!;

        /// <summary>
        /// The name of the user group.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The notification settings of the user group.
        /// </summary>
        [Output("notificationSettings")]
        public Output<Outputs.UserGroupNotificationSettings?> NotificationSettings { get; private set; } = null!;

        /// <summary>
        /// The permissions of the user group.
        /// </summary>
        [Output("permissions")]
        public Output<Outputs.UserGroupPermissions?> Permissions { get; private set; } = null!;

        /// <summary>
        /// The SAML settings for the user group.
        /// </summary>
        [Output("samlSettings")]
        public Output<Outputs.UserGroupSamlSettings?> SamlSettings { get; private set; } = null!;


        /// <summary>
        /// Create a UserGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserGroup(string name, UserGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("harness:index/userGroup:UserGroup", name, args ?? new UserGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserGroup(string name, Input<string> id, UserGroupState? state = null, CustomResourceOptions? options = null)
            : base("harness:index/userGroup:UserGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing UserGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserGroup Get(string name, Input<string> id, UserGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new UserGroup(name, id, state, options);
        }
    }

    public sealed class UserGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the user group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The LDAP settings for the user group.
        /// </summary>
        [Input("ldapSettings")]
        public Input<Inputs.UserGroupLdapSettingsArgs>? LdapSettings { get; set; }

        /// <summary>
        /// The name of the user group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The notification settings of the user group.
        /// </summary>
        [Input("notificationSettings")]
        public Input<Inputs.UserGroupNotificationSettingsArgs>? NotificationSettings { get; set; }

        /// <summary>
        /// The permissions of the user group.
        /// </summary>
        [Input("permissions")]
        public Input<Inputs.UserGroupPermissionsArgs>? Permissions { get; set; }

        /// <summary>
        /// The SAML settings for the user group.
        /// </summary>
        [Input("samlSettings")]
        public Input<Inputs.UserGroupSamlSettingsArgs>? SamlSettings { get; set; }

        public UserGroupArgs()
        {
        }
        public static new UserGroupArgs Empty => new UserGroupArgs();
    }

    public sealed class UserGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the user group.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Indicates whether the user group was imported by SCIM.
        /// </summary>
        [Input("importedByScim")]
        public Input<bool>? ImportedByScim { get; set; }

        /// <summary>
        /// Indicates whether the user group is linked to an SSO provider.
        /// </summary>
        [Input("isSsoLinked")]
        public Input<bool>? IsSsoLinked { get; set; }

        /// <summary>
        /// The LDAP settings for the user group.
        /// </summary>
        [Input("ldapSettings")]
        public Input<Inputs.UserGroupLdapSettingsGetArgs>? LdapSettings { get; set; }

        /// <summary>
        /// The name of the user group.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The notification settings of the user group.
        /// </summary>
        [Input("notificationSettings")]
        public Input<Inputs.UserGroupNotificationSettingsGetArgs>? NotificationSettings { get; set; }

        /// <summary>
        /// The permissions of the user group.
        /// </summary>
        [Input("permissions")]
        public Input<Inputs.UserGroupPermissionsGetArgs>? Permissions { get; set; }

        /// <summary>
        /// The SAML settings for the user group.
        /// </summary>
        [Input("samlSettings")]
        public Input<Inputs.UserGroupSamlSettingsGetArgs>? SamlSettings { get; set; }

        public UserGroupState()
        {
        }
        public static new UserGroupState Empty => new UserGroupState();
    }
}
