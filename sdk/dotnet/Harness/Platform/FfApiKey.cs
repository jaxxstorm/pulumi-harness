// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    /// <summary>
    /// Resource for creating an environment SDK key for Feature Flags.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testserverapikey = new Harness.Platform.FfApiKey("testserverapikey", new()
    ///     {
    ///         Identifier = "testserver",
    ///         Description = "this is a server SDK key",
    ///         OrgId = "test",
    ///         ProjectId = "testff",
    ///         EnvId = "testenv",
    ///         ExpiredAt = 1713729225,
    ///         Type = "Server",
    ///     });
    /// 
    ///     return new Dictionary&lt;string, object?&gt;
    ///     {
    ///         ["serversdkkey"] = testserverapikey.ApiKey,
    ///     };
    /// });
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/ffApiKey:FfApiKey")]
    public partial class FfApiKey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The value of the SDK API Key
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        /// <summary>
        /// Description of the SDK API Key
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Environment Identifier
        /// </summary>
        [Output("envId")]
        public Output<string> EnvId { get; private set; } = null!;

        /// <summary>
        /// Expiration datetime of the SDK API Key
        /// </summary>
        [Output("expiredAt")]
        public Output<int?> ExpiredAt { get; private set; } = null!;

        /// <summary>
        /// Identifier of the SDK API Key
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Name of the SDK API Key
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Type of SDK. Valid values are `Server` or `Client`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a FfApiKey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FfApiKey(string name, FfApiKeyArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/ffApiKey:FfApiKey", name, args ?? new FfApiKeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FfApiKey(string name, Input<string> id, FfApiKeyState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/ffApiKey:FfApiKey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
                AdditionalSecretOutputs =
                {
                    "apiKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FfApiKey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FfApiKey Get(string name, Input<string> id, FfApiKeyState? state = null, CustomResourceOptions? options = null)
        {
            return new FfApiKey(name, id, state, options);
        }
    }

    public sealed class FfApiKeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the SDK API Key
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Environment Identifier
        /// </summary>
        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        /// <summary>
        /// Expiration datetime of the SDK API Key
        /// </summary>
        [Input("expiredAt")]
        public Input<int>? ExpiredAt { get; set; }

        /// <summary>
        /// Identifier of the SDK API Key
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Name of the SDK API Key
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Type of SDK. Valid values are `Server` or `Client`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public FfApiKeyArgs()
        {
        }
        public static new FfApiKeyArgs Empty => new FfApiKeyArgs();
    }

    public sealed class FfApiKeyState : global::Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// The value of the SDK API Key
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Description of the SDK API Key
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Environment Identifier
        /// </summary>
        [Input("envId")]
        public Input<string>? EnvId { get; set; }

        /// <summary>
        /// Expiration datetime of the SDK API Key
        /// </summary>
        [Input("expiredAt")]
        public Input<int>? ExpiredAt { get; set; }

        /// <summary>
        /// Identifier of the SDK API Key
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the SDK API Key
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Organization Identifier
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Project Identifier
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Type of SDK. Valid values are `Server` or `Client`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public FfApiKeyState()
        {
        }
        public static new FfApiKeyState Empty => new FfApiKeyState();
    }
}
