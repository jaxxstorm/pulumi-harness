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

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewAzureKeyVaultConnector(ctx, "example", &platform.AzureKeyVaultConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("example"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				ClientId:             pulumi.String("client_id"),
//				SecretKey:            pulumi.String("account.secret_key"),
//				TenantId:             pulumi.String("tenant_id"),
//				VaultName:            pulumi.String("vault_name"),
//				Subscription:         pulumi.String("subscription"),
//				IsDefault:            pulumi.Bool(false),
//				AzureEnvironmentType: pulumi.String("AZURE"),
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
// # Import account level azure key vault connector
//
// ```sh
// $ pulumi import harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector example <connector_id>
// ```
//
// # Import org level azure key vault connector
//
// ```sh
// $ pulumi import harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level azure key vault connector
//
// ```sh
// $ pulumi import harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector example <org_id>/<project_id>/<connector_id>
// ```
type AzureKeyVaultConnector struct {
	pulumi.CustomResourceState

	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType pulumi.StringOutput `pulumi:"azureEnvironmentType"`
	// Application ID of the Azure App.
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Specifies whether or not is the default value.
	IsDefault pulumi.BoolPtrOutput `pulumi:"isDefault"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey pulumi.StringOutput `pulumi:"secretKey"`
	// Azure subscription ID.
	Subscription pulumi.StringOutput `pulumi:"subscription"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// The Azure Active Directory (Azure AD) directory ID where you created your application.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
	// Name of the vault.
	VaultName pulumi.StringOutput `pulumi:"vaultName"`
}

// NewAzureKeyVaultConnector registers a new resource with the given unique name, arguments, and options.
func NewAzureKeyVaultConnector(ctx *pulumi.Context,
	name string, args *AzureKeyVaultConnectorArgs, opts ...pulumi.ResourceOption) (*AzureKeyVaultConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.SecretKey == nil {
		return nil, errors.New("invalid value for required argument 'SecretKey'")
	}
	if args.Subscription == nil {
		return nil, errors.New("invalid value for required argument 'Subscription'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	if args.VaultName == nil {
		return nil, errors.New("invalid value for required argument 'VaultName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AzureKeyVaultConnector
	err := ctx.RegisterResource("harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureKeyVaultConnector gets an existing AzureKeyVaultConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureKeyVaultConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureKeyVaultConnectorState, opts ...pulumi.ResourceOption) (*AzureKeyVaultConnector, error) {
	var resource AzureKeyVaultConnector
	err := ctx.ReadResource("harness:platform/azureKeyVaultConnector:AzureKeyVaultConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureKeyVaultConnector resources.
type azureKeyVaultConnectorState struct {
	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType *string `pulumi:"azureEnvironmentType"`
	// Application ID of the Azure App.
	ClientId *string `pulumi:"clientId"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Specifies whether or not is the default value.
	IsDefault *bool `pulumi:"isDefault"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey *string `pulumi:"secretKey"`
	// Azure subscription ID.
	Subscription *string `pulumi:"subscription"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// The Azure Active Directory (Azure AD) directory ID where you created your application.
	TenantId *string `pulumi:"tenantId"`
	// Name of the vault.
	VaultName *string `pulumi:"vaultName"`
}

type AzureKeyVaultConnectorState struct {
	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType pulumi.StringPtrInput
	// Application ID of the Azure App.
	ClientId pulumi.StringPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Specifies whether or not is the default value.
	IsDefault pulumi.BoolPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey pulumi.StringPtrInput
	// Azure subscription ID.
	Subscription pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// The Azure Active Directory (Azure AD) directory ID where you created your application.
	TenantId pulumi.StringPtrInput
	// Name of the vault.
	VaultName pulumi.StringPtrInput
}

func (AzureKeyVaultConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureKeyVaultConnectorState)(nil)).Elem()
}

type azureKeyVaultConnectorArgs struct {
	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType *string `pulumi:"azureEnvironmentType"`
	// Application ID of the Azure App.
	ClientId string `pulumi:"clientId"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Specifies whether or not is the default value.
	IsDefault *bool `pulumi:"isDefault"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey string `pulumi:"secretKey"`
	// Azure subscription ID.
	Subscription string `pulumi:"subscription"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// The Azure Active Directory (Azure AD) directory ID where you created your application.
	TenantId string `pulumi:"tenantId"`
	// Name of the vault.
	VaultName string `pulumi:"vaultName"`
}

// The set of arguments for constructing a AzureKeyVaultConnector resource.
type AzureKeyVaultConnectorArgs struct {
	// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
	AzureEnvironmentType pulumi.StringPtrInput
	// Application ID of the Azure App.
	ClientId pulumi.StringInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Specifies whether or not is the default value.
	IsDefault pulumi.BoolPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The Harness text secret with the Azure authentication key as its value.
	SecretKey pulumi.StringInput
	// Azure subscription ID.
	Subscription pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// The Azure Active Directory (Azure AD) directory ID where you created your application.
	TenantId pulumi.StringInput
	// Name of the vault.
	VaultName pulumi.StringInput
}

func (AzureKeyVaultConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureKeyVaultConnectorArgs)(nil)).Elem()
}

type AzureKeyVaultConnectorInput interface {
	pulumi.Input

	ToAzureKeyVaultConnectorOutput() AzureKeyVaultConnectorOutput
	ToAzureKeyVaultConnectorOutputWithContext(ctx context.Context) AzureKeyVaultConnectorOutput
}

func (*AzureKeyVaultConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureKeyVaultConnector)(nil)).Elem()
}

func (i *AzureKeyVaultConnector) ToAzureKeyVaultConnectorOutput() AzureKeyVaultConnectorOutput {
	return i.ToAzureKeyVaultConnectorOutputWithContext(context.Background())
}

func (i *AzureKeyVaultConnector) ToAzureKeyVaultConnectorOutputWithContext(ctx context.Context) AzureKeyVaultConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureKeyVaultConnectorOutput)
}

// AzureKeyVaultConnectorArrayInput is an input type that accepts AzureKeyVaultConnectorArray and AzureKeyVaultConnectorArrayOutput values.
// You can construct a concrete instance of `AzureKeyVaultConnectorArrayInput` via:
//
//	AzureKeyVaultConnectorArray{ AzureKeyVaultConnectorArgs{...} }
type AzureKeyVaultConnectorArrayInput interface {
	pulumi.Input

	ToAzureKeyVaultConnectorArrayOutput() AzureKeyVaultConnectorArrayOutput
	ToAzureKeyVaultConnectorArrayOutputWithContext(context.Context) AzureKeyVaultConnectorArrayOutput
}

type AzureKeyVaultConnectorArray []AzureKeyVaultConnectorInput

func (AzureKeyVaultConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureKeyVaultConnector)(nil)).Elem()
}

func (i AzureKeyVaultConnectorArray) ToAzureKeyVaultConnectorArrayOutput() AzureKeyVaultConnectorArrayOutput {
	return i.ToAzureKeyVaultConnectorArrayOutputWithContext(context.Background())
}

func (i AzureKeyVaultConnectorArray) ToAzureKeyVaultConnectorArrayOutputWithContext(ctx context.Context) AzureKeyVaultConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureKeyVaultConnectorArrayOutput)
}

// AzureKeyVaultConnectorMapInput is an input type that accepts AzureKeyVaultConnectorMap and AzureKeyVaultConnectorMapOutput values.
// You can construct a concrete instance of `AzureKeyVaultConnectorMapInput` via:
//
//	AzureKeyVaultConnectorMap{ "key": AzureKeyVaultConnectorArgs{...} }
type AzureKeyVaultConnectorMapInput interface {
	pulumi.Input

	ToAzureKeyVaultConnectorMapOutput() AzureKeyVaultConnectorMapOutput
	ToAzureKeyVaultConnectorMapOutputWithContext(context.Context) AzureKeyVaultConnectorMapOutput
}

type AzureKeyVaultConnectorMap map[string]AzureKeyVaultConnectorInput

func (AzureKeyVaultConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureKeyVaultConnector)(nil)).Elem()
}

func (i AzureKeyVaultConnectorMap) ToAzureKeyVaultConnectorMapOutput() AzureKeyVaultConnectorMapOutput {
	return i.ToAzureKeyVaultConnectorMapOutputWithContext(context.Background())
}

func (i AzureKeyVaultConnectorMap) ToAzureKeyVaultConnectorMapOutputWithContext(ctx context.Context) AzureKeyVaultConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureKeyVaultConnectorMapOutput)
}

type AzureKeyVaultConnectorOutput struct{ *pulumi.OutputState }

func (AzureKeyVaultConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureKeyVaultConnector)(nil)).Elem()
}

func (o AzureKeyVaultConnectorOutput) ToAzureKeyVaultConnectorOutput() AzureKeyVaultConnectorOutput {
	return o
}

func (o AzureKeyVaultConnectorOutput) ToAzureKeyVaultConnectorOutputWithContext(ctx context.Context) AzureKeyVaultConnectorOutput {
	return o
}

// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
func (o AzureKeyVaultConnectorOutput) AzureEnvironmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.AzureEnvironmentType }).(pulumi.StringOutput)
}

// Application ID of the Azure App.
func (o AzureKeyVaultConnectorOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o AzureKeyVaultConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o AzureKeyVaultConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o AzureKeyVaultConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Specifies whether or not is the default value.
func (o AzureKeyVaultConnectorOutput) IsDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.BoolPtrOutput { return v.IsDefault }).(pulumi.BoolPtrOutput)
}

// Name of the resource.
func (o AzureKeyVaultConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o AzureKeyVaultConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o AzureKeyVaultConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The Harness text secret with the Azure authentication key as its value.
func (o AzureKeyVaultConnectorOutput) SecretKey() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.SecretKey }).(pulumi.StringOutput)
}

// Azure subscription ID.
func (o AzureKeyVaultConnectorOutput) Subscription() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.Subscription }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o AzureKeyVaultConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// The Azure Active Directory (Azure AD) directory ID where you created your application.
func (o AzureKeyVaultConnectorOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

// Name of the vault.
func (o AzureKeyVaultConnectorOutput) VaultName() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureKeyVaultConnector) pulumi.StringOutput { return v.VaultName }).(pulumi.StringOutput)
}

type AzureKeyVaultConnectorArrayOutput struct{ *pulumi.OutputState }

func (AzureKeyVaultConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureKeyVaultConnector)(nil)).Elem()
}

func (o AzureKeyVaultConnectorArrayOutput) ToAzureKeyVaultConnectorArrayOutput() AzureKeyVaultConnectorArrayOutput {
	return o
}

func (o AzureKeyVaultConnectorArrayOutput) ToAzureKeyVaultConnectorArrayOutputWithContext(ctx context.Context) AzureKeyVaultConnectorArrayOutput {
	return o
}

func (o AzureKeyVaultConnectorArrayOutput) Index(i pulumi.IntInput) AzureKeyVaultConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureKeyVaultConnector {
		return vs[0].([]*AzureKeyVaultConnector)[vs[1].(int)]
	}).(AzureKeyVaultConnectorOutput)
}

type AzureKeyVaultConnectorMapOutput struct{ *pulumi.OutputState }

func (AzureKeyVaultConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureKeyVaultConnector)(nil)).Elem()
}

func (o AzureKeyVaultConnectorMapOutput) ToAzureKeyVaultConnectorMapOutput() AzureKeyVaultConnectorMapOutput {
	return o
}

func (o AzureKeyVaultConnectorMapOutput) ToAzureKeyVaultConnectorMapOutputWithContext(ctx context.Context) AzureKeyVaultConnectorMapOutput {
	return o
}

func (o AzureKeyVaultConnectorMapOutput) MapIndex(k pulumi.StringInput) AzureKeyVaultConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureKeyVaultConnector {
		return vs[0].(map[string]*AzureKeyVaultConnector)[vs[1].(string)]
	}).(AzureKeyVaultConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureKeyVaultConnectorInput)(nil)).Elem(), &AzureKeyVaultConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureKeyVaultConnectorArrayInput)(nil)).Elem(), AzureKeyVaultConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureKeyVaultConnectorMapInput)(nil)).Elem(), AzureKeyVaultConnectorMap{})
	pulumi.RegisterOutputType(AzureKeyVaultConnectorOutput{})
	pulumi.RegisterOutputType(AzureKeyVaultConnectorArrayOutput{})
	pulumi.RegisterOutputType(AzureKeyVaultConnectorMapOutput{})
}
