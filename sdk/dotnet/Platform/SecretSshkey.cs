// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Import account level secret sshkey
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/secretSshkey:SecretSshkey example &lt;secret_sshkey_id&gt;
    /// ```
    /// 
    /// Import org level secret sshkey
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/secretSshkey:SecretSshkey example &lt;ord_id&gt;/&lt;secret_sshkey_id&gt;
    /// ```
    /// 
    /// Import project level secret sshkey
    /// 
    /// ```sh
    /// $ pulumi import harness:platform/secretSshkey:SecretSshkey example &lt;org_id&gt;/&lt;project_id&gt;/&lt;secret_sshkey_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/secretSshkey:SecretSshkey")]
    public partial class SecretSshkey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Output("kerberos")]
        public Output<Outputs.SecretSshkeyKerberos?> Kerberos { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// SSH port
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Output("ssh")]
        public Output<Outputs.SecretSshkeySsh?> Ssh { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SecretSshkey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretSshkey(string name, SecretSshkeyArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/secretSshkey:SecretSshkey", name, args ?? new SecretSshkeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretSshkey(string name, Input<string> id, SecretSshkeyState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/secretSshkey:SecretSshkey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretSshkey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretSshkey Get(string name, Input<string> id, SecretSshkeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretSshkey(name, id, state, options);
        }
    }

    public sealed class SecretSshkeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("kerberos")]
        public Input<Inputs.SecretSshkeyKerberosArgs>? Kerberos { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// SSH port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.SecretSshkeySshArgs>? Ssh { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SecretSshkeyArgs()
        {
        }
        public static new SecretSshkeyArgs Empty => new SecretSshkeyArgs();
    }

    public sealed class SecretSshkeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("kerberos")]
        public Input<Inputs.SecretSshkeyKerberosGetArgs>? Kerberos { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// SSH port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.SecretSshkeySshGetArgs>? Ssh { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SecretSshkeyState()
        {
        }
        public static new SecretSshkeyState Empty => new SecretSshkeyState();
    }
}