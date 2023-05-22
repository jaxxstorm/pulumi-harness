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

    public sealed class ConnectorSpotPermanentTokenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Reference to the Harness secret containing the permanent api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("apiTokenRef", required: true)]
        public Input<string> ApiTokenRef { get; set; } = null!;

        [Input("delegateSelectors")]
        private InputList<string>? _delegateSelectors;

        /// <summary>
        /// Connect only using delegates with these tags.
        /// </summary>
        public InputList<string> DelegateSelectors
        {
            get => _delegateSelectors ?? (_delegateSelectors = new InputList<string>());
            set => _delegateSelectors = value;
        }

        /// <summary>
        /// Execute on delegate or not.
        /// </summary>
        [Input("executeOnDelegate")]
        public Input<bool>? ExecuteOnDelegate { get; set; }

        /// <summary>
        /// Spot account id.
        /// </summary>
        [Input("spotAccountId")]
        public Input<string>? SpotAccountId { get; set; }

        /// <summary>
        /// Reference to the Harness secret containing the spot account id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        [Input("spotAccountIdRef")]
        public Input<string>? SpotAccountIdRef { get; set; }

        public ConnectorSpotPermanentTokenGetArgs()
        {
        }
        public static new ConnectorSpotPermanentTokenGetArgs Empty => new ConnectorSpotPermanentTokenGetArgs();
    }
}
