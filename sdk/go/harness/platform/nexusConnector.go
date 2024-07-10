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

// Resource for creating a Nexus connector.
//
// ## Example to create Nexus Connector at different levels (Org, Project, Account)
//
// ## Import
//
// # Import account level nexus connector
//
// ```sh
// $ pulumi import harness:platform/nexusConnector:NexusConnector example <connector_id>
// ```
//
// # Import org level nexus connector
//
// ```sh
// $ pulumi import harness:platform/nexusConnector:NexusConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level nexus connector
//
// ```sh
// $ pulumi import harness:platform/nexusConnector:NexusConnector example <org_id>/<project_id>/<connector_id>
// ```
type NexusConnector struct {
	pulumi.CustomResourceState

	// Credentials to use for authentication.
	Credentials NexusConnectorCredentialsPtrOutput `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
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
	// URL of the Nexus server.
	Url pulumi.StringOutput `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewNexusConnector registers a new resource with the given unique name, arguments, and options.
func NewNexusConnector(ctx *pulumi.Context,
	name string, args *NexusConnectorArgs, opts ...pulumi.ResourceOption) (*NexusConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource NexusConnector
	err := ctx.RegisterResource("harness:platform/nexusConnector:NexusConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNexusConnector gets an existing NexusConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNexusConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NexusConnectorState, opts ...pulumi.ResourceOption) (*NexusConnector, error) {
	var resource NexusConnector
	err := ctx.ReadResource("harness:platform/nexusConnector:NexusConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NexusConnector resources.
type nexusConnectorState struct {
	// Credentials to use for authentication.
	Credentials *NexusConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
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
	// URL of the Nexus server.
	Url *string `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version *string `pulumi:"version"`
}

type NexusConnectorState struct {
	// Credentials to use for authentication.
	Credentials NexusConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
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
	// URL of the Nexus server.
	Url pulumi.StringPtrInput
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringPtrInput
}

func (NexusConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*nexusConnectorState)(nil)).Elem()
}

type nexusConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials *NexusConnectorCredentials `pulumi:"credentials"`
	// Tags to filter delegates for connection.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
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
	// URL of the Nexus server.
	Url string `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a NexusConnector resource.
type NexusConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials NexusConnectorCredentialsPtrInput
	// Tags to filter delegates for connection.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
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
	// URL of the Nexus server.
	Url pulumi.StringInput
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringInput
}

func (NexusConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nexusConnectorArgs)(nil)).Elem()
}

type NexusConnectorInput interface {
	pulumi.Input

	ToNexusConnectorOutput() NexusConnectorOutput
	ToNexusConnectorOutputWithContext(ctx context.Context) NexusConnectorOutput
}

func (*NexusConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**NexusConnector)(nil)).Elem()
}

func (i *NexusConnector) ToNexusConnectorOutput() NexusConnectorOutput {
	return i.ToNexusConnectorOutputWithContext(context.Background())
}

func (i *NexusConnector) ToNexusConnectorOutputWithContext(ctx context.Context) NexusConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusConnectorOutput)
}

// NexusConnectorArrayInput is an input type that accepts NexusConnectorArray and NexusConnectorArrayOutput values.
// You can construct a concrete instance of `NexusConnectorArrayInput` via:
//
//	NexusConnectorArray{ NexusConnectorArgs{...} }
type NexusConnectorArrayInput interface {
	pulumi.Input

	ToNexusConnectorArrayOutput() NexusConnectorArrayOutput
	ToNexusConnectorArrayOutputWithContext(context.Context) NexusConnectorArrayOutput
}

type NexusConnectorArray []NexusConnectorInput

func (NexusConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NexusConnector)(nil)).Elem()
}

func (i NexusConnectorArray) ToNexusConnectorArrayOutput() NexusConnectorArrayOutput {
	return i.ToNexusConnectorArrayOutputWithContext(context.Background())
}

func (i NexusConnectorArray) ToNexusConnectorArrayOutputWithContext(ctx context.Context) NexusConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusConnectorArrayOutput)
}

// NexusConnectorMapInput is an input type that accepts NexusConnectorMap and NexusConnectorMapOutput values.
// You can construct a concrete instance of `NexusConnectorMapInput` via:
//
//	NexusConnectorMap{ "key": NexusConnectorArgs{...} }
type NexusConnectorMapInput interface {
	pulumi.Input

	ToNexusConnectorMapOutput() NexusConnectorMapOutput
	ToNexusConnectorMapOutputWithContext(context.Context) NexusConnectorMapOutput
}

type NexusConnectorMap map[string]NexusConnectorInput

func (NexusConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NexusConnector)(nil)).Elem()
}

func (i NexusConnectorMap) ToNexusConnectorMapOutput() NexusConnectorMapOutput {
	return i.ToNexusConnectorMapOutputWithContext(context.Background())
}

func (i NexusConnectorMap) ToNexusConnectorMapOutputWithContext(ctx context.Context) NexusConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusConnectorMapOutput)
}

type NexusConnectorOutput struct{ *pulumi.OutputState }

func (NexusConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NexusConnector)(nil)).Elem()
}

func (o NexusConnectorOutput) ToNexusConnectorOutput() NexusConnectorOutput {
	return o
}

func (o NexusConnectorOutput) ToNexusConnectorOutputWithContext(ctx context.Context) NexusConnectorOutput {
	return o
}

// Credentials to use for authentication.
func (o NexusConnectorOutput) Credentials() NexusConnectorCredentialsPtrOutput {
	return o.ApplyT(func(v *NexusConnector) NexusConnectorCredentialsPtrOutput { return v.Credentials }).(NexusConnectorCredentialsPtrOutput)
}

// Tags to filter delegates for connection.
func (o NexusConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o NexusConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o NexusConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o NexusConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o NexusConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o NexusConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o NexusConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Nexus server.
func (o NexusConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Version of the Nexus server. Valid values are 2.x, 3.x
func (o NexusConnectorOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *NexusConnector) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type NexusConnectorArrayOutput struct{ *pulumi.OutputState }

func (NexusConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NexusConnector)(nil)).Elem()
}

func (o NexusConnectorArrayOutput) ToNexusConnectorArrayOutput() NexusConnectorArrayOutput {
	return o
}

func (o NexusConnectorArrayOutput) ToNexusConnectorArrayOutputWithContext(ctx context.Context) NexusConnectorArrayOutput {
	return o
}

func (o NexusConnectorArrayOutput) Index(i pulumi.IntInput) NexusConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NexusConnector {
		return vs[0].([]*NexusConnector)[vs[1].(int)]
	}).(NexusConnectorOutput)
}

type NexusConnectorMapOutput struct{ *pulumi.OutputState }

func (NexusConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NexusConnector)(nil)).Elem()
}

func (o NexusConnectorMapOutput) ToNexusConnectorMapOutput() NexusConnectorMapOutput {
	return o
}

func (o NexusConnectorMapOutput) ToNexusConnectorMapOutputWithContext(ctx context.Context) NexusConnectorMapOutput {
	return o
}

func (o NexusConnectorMapOutput) MapIndex(k pulumi.StringInput) NexusConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NexusConnector {
		return vs[0].(map[string]*NexusConnector)[vs[1].(string)]
	}).(NexusConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NexusConnectorInput)(nil)).Elem(), &NexusConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*NexusConnectorArrayInput)(nil)).Elem(), NexusConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NexusConnectorMapInput)(nil)).Elem(), NexusConnectorMap{})
	pulumi.RegisterOutputType(NexusConnectorOutput{})
	pulumi.RegisterOutputType(NexusConnectorArrayOutput{})
	pulumi.RegisterOutputType(NexusConnectorMapOutput{})
}
