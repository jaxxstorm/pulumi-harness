// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class BitbucketConnectorApiAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Personal access token for interacting with the BitBucket api. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("tokenRef", required: true)]
        public Input<string> TokenRef { get; set; } = null!;

        /// <summary>
        /// The username used for connecting to the api.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        /// <summary>
        /// The name of the Harness secret containing the username. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("usernameRef")]
        public Input<string>? UsernameRef { get; set; }

        public BitbucketConnectorApiAuthenticationArgs()
        {
        }
        public static new BitbucketConnectorApiAuthenticationArgs Empty => new BitbucketConnectorApiAuthenticationArgs();
    }
}
