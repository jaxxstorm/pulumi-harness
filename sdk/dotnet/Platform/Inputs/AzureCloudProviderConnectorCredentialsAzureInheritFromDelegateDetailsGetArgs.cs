// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Platform.Inputs
{

    public sealed class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Auth to authenticate to Azure Cloud Provider using details inheriting from delegate.
        /// </summary>
        [Input("auth")]
        public Input<Inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthGetArgs>? Auth { get; set; }

        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsGetArgs()
        {
        }
        public static new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsGetArgs Empty => new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsGetArgs();
    }
}