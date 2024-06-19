// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-harness/sdk/go/harness/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an Azure Cloud Provider in Harness.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewAzureCloudProviderConnector(ctx, "manual_config_secret", &platform.AzureCloudProviderConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Credentials: &platform.AzureCloudProviderConnectorCredentialsArgs{
//					Type: pulumi.String("ManualConfig"),
//					AzureManualDetails: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs{
//						ApplicationId: pulumi.String("application_id"),
//						TenantId:      pulumi.String("tenant_id"),
//						Auth: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs{
//							Type: pulumi.String("Secret"),
//							AzureClientSecretKey: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs{
//								SecretRef: pulumi.String(fmt.Sprintf("account.%v", test.Id)),
//							},
//						},
//					},
//				},
//				AzureEnvironmentType: pulumi.String("AZURE"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewAzureCloudProviderConnector(ctx, "manual_config_certificate", &platform.AzureCloudProviderConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Credentials: &platform.AzureCloudProviderConnectorCredentialsArgs{
//					Type: pulumi.String("ManualConfig"),
//					AzureManualDetails: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs{
//						ApplicationId: pulumi.String("application_id"),
//						TenantId:      pulumi.String("tenant_id"),
//						Auth: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs{
//							Type: pulumi.String("Certificate"),
//							AzureClientKeyCert: &platform.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCertArgs{
//								CertificateRef: pulumi.String(fmt.Sprintf("account.%v", test.Id)),
//							},
//						},
//					},
//				},
//				AzureEnvironmentType: pulumi.String("AZURE"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewAzureCloudProviderConnector(ctx, "inherit_from_delegate_user_assigned_managed_identity", &platform.AzureCloudProviderConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Credentials: &platform.AzureCloudProviderConnectorCredentialsArgs{
//					Type: pulumi.String("InheritFromDelegate"),
//					AzureInheritFromDelegateDetails: &platform.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs{
//						Auth: &platform.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs{
//							AzureMsiAuthUa: &platform.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs{
//								ClientId: pulumi.String("client_id"),
//							},
//							Type: pulumi.String("UserAssignedManagedIdentity"),
//						},
//					},
//				},
//				AzureEnvironmentType: pulumi.String("AZURE"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewAzureCloudProviderConnector(ctx, "inherit_from_delegate_system_assigned_managed_identity", &platform.AzureCloudProviderConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				Credentials: &platform.AzureCloudProviderConnectorCredentialsArgs{
//					Type: pulumi.String("InheritFromDelegate"),
//					AzureInheritFromDelegateDetails: &platform.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs{
//						Auth: &platform.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs{
//							Type: pulumi.String("SystemAssignedManagedIdentity"),
//						},
//					},
//				},
//				AzureEnvironmentType: pulumi.String("AZURE"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import account level azure cloud provider connector
//
// ```sh
// $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <connector_id>
// ```
//
// # Import org level azure cloud provider connector
//
// ```sh
// $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level azure cloud provider connector
//
// ```sh
// $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example <org_id>/<project_id>/<connector_id>
// ```
type AzureCloudProviderConnector struct {
	pulumi.CustomResourceState

	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType pulumi.StringOutput `pulumi:"azureEnvironmentType"`
	// Contains Azure connector credentials.
	Credentials AzureCloudProviderConnectorCredentialsOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrOutput `pulumi:"executeOnDelegate"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewAzureCloudProviderConnector registers a new resource with the given unique name, arguments, and options.
func NewAzureCloudProviderConnector(ctx *pulumi.Context,
	name string, args *AzureCloudProviderConnectorArgs, opts ...pulumi.ResourceOption) (*AzureCloudProviderConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Credentials == nil {
		return nil, errors.New("invalid value for required argument 'Credentials'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AzureCloudProviderConnector
	err := ctx.RegisterResource("harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureCloudProviderConnector gets an existing AzureCloudProviderConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureCloudProviderConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureCloudProviderConnectorState, opts ...pulumi.ResourceOption) (*AzureCloudProviderConnector, error) {
	var resource AzureCloudProviderConnector
	err := ctx.ReadResource("harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureCloudProviderConnector resources.
type azureCloudProviderConnectorState struct {
	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType *string `pulumi:"azureEnvironmentType"`
	// Contains Azure connector credentials.
	Credentials *AzureCloudProviderConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type AzureCloudProviderConnectorState struct {
	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType pulumi.StringPtrInput
	// Contains Azure connector credentials.
	Credentials AzureCloudProviderConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (AzureCloudProviderConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureCloudProviderConnectorState)(nil)).Elem()
}

type azureCloudProviderConnectorArgs struct {
	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType *string `pulumi:"azureEnvironmentType"`
	// Contains Azure connector credentials.
	Credentials AzureCloudProviderConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Execute on delegate or not.
	ExecuteOnDelegate *bool `pulumi:"executeOnDelegate"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a AzureCloudProviderConnector resource.
type AzureCloudProviderConnectorArgs struct {
	// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
	AzureEnvironmentType pulumi.StringPtrInput
	// Contains Azure connector credentials.
	Credentials AzureCloudProviderConnectorCredentialsInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Execute on delegate or not.
	ExecuteOnDelegate pulumi.BoolPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (AzureCloudProviderConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureCloudProviderConnectorArgs)(nil)).Elem()
}

type AzureCloudProviderConnectorInput interface {
	pulumi.Input

	ToAzureCloudProviderConnectorOutput() AzureCloudProviderConnectorOutput
	ToAzureCloudProviderConnectorOutputWithContext(ctx context.Context) AzureCloudProviderConnectorOutput
}

func (*AzureCloudProviderConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureCloudProviderConnector)(nil)).Elem()
}

func (i *AzureCloudProviderConnector) ToAzureCloudProviderConnectorOutput() AzureCloudProviderConnectorOutput {
	return i.ToAzureCloudProviderConnectorOutputWithContext(context.Background())
}

func (i *AzureCloudProviderConnector) ToAzureCloudProviderConnectorOutputWithContext(ctx context.Context) AzureCloudProviderConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudProviderConnectorOutput)
}

// AzureCloudProviderConnectorArrayInput is an input type that accepts AzureCloudProviderConnectorArray and AzureCloudProviderConnectorArrayOutput values.
// You can construct a concrete instance of `AzureCloudProviderConnectorArrayInput` via:
//
//	AzureCloudProviderConnectorArray{ AzureCloudProviderConnectorArgs{...} }
type AzureCloudProviderConnectorArrayInput interface {
	pulumi.Input

	ToAzureCloudProviderConnectorArrayOutput() AzureCloudProviderConnectorArrayOutput
	ToAzureCloudProviderConnectorArrayOutputWithContext(context.Context) AzureCloudProviderConnectorArrayOutput
}

type AzureCloudProviderConnectorArray []AzureCloudProviderConnectorInput

func (AzureCloudProviderConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureCloudProviderConnector)(nil)).Elem()
}

func (i AzureCloudProviderConnectorArray) ToAzureCloudProviderConnectorArrayOutput() AzureCloudProviderConnectorArrayOutput {
	return i.ToAzureCloudProviderConnectorArrayOutputWithContext(context.Background())
}

func (i AzureCloudProviderConnectorArray) ToAzureCloudProviderConnectorArrayOutputWithContext(ctx context.Context) AzureCloudProviderConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudProviderConnectorArrayOutput)
}

// AzureCloudProviderConnectorMapInput is an input type that accepts AzureCloudProviderConnectorMap and AzureCloudProviderConnectorMapOutput values.
// You can construct a concrete instance of `AzureCloudProviderConnectorMapInput` via:
//
//	AzureCloudProviderConnectorMap{ "key": AzureCloudProviderConnectorArgs{...} }
type AzureCloudProviderConnectorMapInput interface {
	pulumi.Input

	ToAzureCloudProviderConnectorMapOutput() AzureCloudProviderConnectorMapOutput
	ToAzureCloudProviderConnectorMapOutputWithContext(context.Context) AzureCloudProviderConnectorMapOutput
}

type AzureCloudProviderConnectorMap map[string]AzureCloudProviderConnectorInput

func (AzureCloudProviderConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureCloudProviderConnector)(nil)).Elem()
}

func (i AzureCloudProviderConnectorMap) ToAzureCloudProviderConnectorMapOutput() AzureCloudProviderConnectorMapOutput {
	return i.ToAzureCloudProviderConnectorMapOutputWithContext(context.Background())
}

func (i AzureCloudProviderConnectorMap) ToAzureCloudProviderConnectorMapOutputWithContext(ctx context.Context) AzureCloudProviderConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudProviderConnectorMapOutput)
}

type AzureCloudProviderConnectorOutput struct{ *pulumi.OutputState }

func (AzureCloudProviderConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureCloudProviderConnector)(nil)).Elem()
}

func (o AzureCloudProviderConnectorOutput) ToAzureCloudProviderConnectorOutput() AzureCloudProviderConnectorOutput {
	return o
}

func (o AzureCloudProviderConnectorOutput) ToAzureCloudProviderConnectorOutputWithContext(ctx context.Context) AzureCloudProviderConnectorOutput {
	return o
}

// Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
func (o AzureCloudProviderConnectorOutput) AzureEnvironmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringOutput { return v.AzureEnvironmentType }).(pulumi.StringOutput)
}

// Contains Azure connector credentials.
func (o AzureCloudProviderConnectorOutput) Credentials() AzureCloudProviderConnectorCredentialsOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) AzureCloudProviderConnectorCredentialsOutput {
		return v.Credentials
	}).(AzureCloudProviderConnectorCredentialsOutput)
}

// Tags to filter delegates for connection.
func (o AzureCloudProviderConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o AzureCloudProviderConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Execute on delegate or not.
func (o AzureCloudProviderConnectorOutput) ExecuteOnDelegate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.BoolPtrOutput { return v.ExecuteOnDelegate }).(pulumi.BoolPtrOutput)
}

// Unique identifier of the resource.
func (o AzureCloudProviderConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o AzureCloudProviderConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o AzureCloudProviderConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o AzureCloudProviderConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o AzureCloudProviderConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureCloudProviderConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type AzureCloudProviderConnectorArrayOutput struct{ *pulumi.OutputState }

func (AzureCloudProviderConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureCloudProviderConnector)(nil)).Elem()
}

func (o AzureCloudProviderConnectorArrayOutput) ToAzureCloudProviderConnectorArrayOutput() AzureCloudProviderConnectorArrayOutput {
	return o
}

func (o AzureCloudProviderConnectorArrayOutput) ToAzureCloudProviderConnectorArrayOutputWithContext(ctx context.Context) AzureCloudProviderConnectorArrayOutput {
	return o
}

func (o AzureCloudProviderConnectorArrayOutput) Index(i pulumi.IntInput) AzureCloudProviderConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureCloudProviderConnector {
		return vs[0].([]*AzureCloudProviderConnector)[vs[1].(int)]
	}).(AzureCloudProviderConnectorOutput)
}

type AzureCloudProviderConnectorMapOutput struct{ *pulumi.OutputState }

func (AzureCloudProviderConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureCloudProviderConnector)(nil)).Elem()
}

func (o AzureCloudProviderConnectorMapOutput) ToAzureCloudProviderConnectorMapOutput() AzureCloudProviderConnectorMapOutput {
	return o
}

func (o AzureCloudProviderConnectorMapOutput) ToAzureCloudProviderConnectorMapOutputWithContext(ctx context.Context) AzureCloudProviderConnectorMapOutput {
	return o
}

func (o AzureCloudProviderConnectorMapOutput) MapIndex(k pulumi.StringInput) AzureCloudProviderConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureCloudProviderConnector {
		return vs[0].(map[string]*AzureCloudProviderConnector)[vs[1].(string)]
	}).(AzureCloudProviderConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudProviderConnectorInput)(nil)).Elem(), &AzureCloudProviderConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudProviderConnectorArrayInput)(nil)).Elem(), AzureCloudProviderConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudProviderConnectorMapInput)(nil)).Elem(), AzureCloudProviderConnectorMap{})
	pulumi.RegisterOutputType(AzureCloudProviderConnectorOutput{})
	pulumi.RegisterOutputType(AzureCloudProviderConnectorArrayOutput{})
	pulumi.RegisterOutputType(AzureCloudProviderConnectorMapOutput{})
}
