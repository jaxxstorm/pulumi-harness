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

    public sealed class ConnectorAzureCloudProviderCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs : global::Pulumi.ResourceArgs
    {
        [Input("secretRef")]
        public Input<string>? SecretRef { get; set; }

        public ConnectorAzureCloudProviderCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs()
        {
        }
        public static new ConnectorAzureCloudProviderCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs Empty => new ConnectorAzureCloudProviderCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs();
    }
}
