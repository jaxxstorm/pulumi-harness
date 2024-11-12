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

// Resource for creating a GCP Cloud Cost connector in Harness.
//
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
//			_, err := platform.NewGcpCloudCostConnector(ctx, "test", &platform.GcpCloudCostConnectorArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				FeaturesEnableds: pulumi.StringArray{
//					pulumi.String("BILLING"),
//					pulumi.String("VISIBILITY"),
//					pulumi.String("OPTIMIZATION"),
//					pulumi.String("GOVERNANCE"),
//				},
//				GcpProjectId:        pulumi.String("gcp_project_id"),
//				ServiceAccountEmail: pulumi.String("service_account_email"),
//				BillingExportSpec: &platform.GcpCloudCostConnectorBillingExportSpecArgs{
//					DataSetId: pulumi.String("data_set_id"),
//					TableId:   pulumi.String("table_id"),
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
// # Import account level gcp cloud cost connector
//
// ```sh
// $ pulumi import harness:platform/gcpCloudCostConnector:GcpCloudCostConnector example <connector_id>
// ```
//
// # Import org level gcp cloud cost connector
//
// ```sh
// $ pulumi import harness:platform/gcpCloudCostConnector:GcpCloudCostConnector example <ord_id>/<connector_id>
// ```
//
// # Import project level gcp cloud cost connector
//
// ```sh
// $ pulumi import harness:platform/gcpCloudCostConnector:GcpCloudCostConnector example <org_id>/<project_id>/<connector_id>
// ```
type GcpCloudCostConnector struct {
	pulumi.CustomResourceState

	// Returns billing details.
	BillingExportSpec GcpCloudCostConnectorBillingExportSpecPtrOutput `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
	FeaturesEnableds pulumi.StringArrayOutput `pulumi:"featuresEnableds"`
	// GCP Project Id.
	GcpProjectId pulumi.StringOutput `pulumi:"gcpProjectId"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Email corresponding to the Service Account.
	ServiceAccountEmail pulumi.StringOutput `pulumi:"serviceAccountEmail"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewGcpCloudCostConnector registers a new resource with the given unique name, arguments, and options.
func NewGcpCloudCostConnector(ctx *pulumi.Context,
	name string, args *GcpCloudCostConnectorArgs, opts ...pulumi.ResourceOption) (*GcpCloudCostConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeaturesEnableds == nil {
		return nil, errors.New("invalid value for required argument 'FeaturesEnableds'")
	}
	if args.GcpProjectId == nil {
		return nil, errors.New("invalid value for required argument 'GcpProjectId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ServiceAccountEmail == nil {
		return nil, errors.New("invalid value for required argument 'ServiceAccountEmail'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource GcpCloudCostConnector
	err := ctx.RegisterResource("harness:platform/gcpCloudCostConnector:GcpCloudCostConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGcpCloudCostConnector gets an existing GcpCloudCostConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGcpCloudCostConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GcpCloudCostConnectorState, opts ...pulumi.ResourceOption) (*GcpCloudCostConnector, error) {
	var resource GcpCloudCostConnector
	err := ctx.ReadResource("harness:platform/gcpCloudCostConnector:GcpCloudCostConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GcpCloudCostConnector resources.
type gcpCloudCostConnectorState struct {
	// Returns billing details.
	BillingExportSpec *GcpCloudCostConnectorBillingExportSpec `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
	// GCP Project Id.
	GcpProjectId *string `pulumi:"gcpProjectId"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Email corresponding to the Service Account.
	ServiceAccountEmail *string `pulumi:"serviceAccountEmail"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type GcpCloudCostConnectorState struct {
	// Returns billing details.
	BillingExportSpec GcpCloudCostConnectorBillingExportSpecPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
	FeaturesEnableds pulumi.StringArrayInput
	// GCP Project Id.
	GcpProjectId pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Email corresponding to the Service Account.
	ServiceAccountEmail pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (GcpCloudCostConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpCloudCostConnectorState)(nil)).Elem()
}

type gcpCloudCostConnectorArgs struct {
	// Returns billing details.
	BillingExportSpec *GcpCloudCostConnectorBillingExportSpec `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
	// GCP Project Id.
	GcpProjectId string `pulumi:"gcpProjectId"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Email corresponding to the Service Account.
	ServiceAccountEmail string `pulumi:"serviceAccountEmail"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a GcpCloudCostConnector resource.
type GcpCloudCostConnectorArgs struct {
	// Returns billing details.
	BillingExportSpec GcpCloudCostConnectorBillingExportSpecPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
	FeaturesEnableds pulumi.StringArrayInput
	// GCP Project Id.
	GcpProjectId pulumi.StringInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Email corresponding to the Service Account.
	ServiceAccountEmail pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (GcpCloudCostConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gcpCloudCostConnectorArgs)(nil)).Elem()
}

type GcpCloudCostConnectorInput interface {
	pulumi.Input

	ToGcpCloudCostConnectorOutput() GcpCloudCostConnectorOutput
	ToGcpCloudCostConnectorOutputWithContext(ctx context.Context) GcpCloudCostConnectorOutput
}

func (*GcpCloudCostConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpCloudCostConnector)(nil)).Elem()
}

func (i *GcpCloudCostConnector) ToGcpCloudCostConnectorOutput() GcpCloudCostConnectorOutput {
	return i.ToGcpCloudCostConnectorOutputWithContext(context.Background())
}

func (i *GcpCloudCostConnector) ToGcpCloudCostConnectorOutputWithContext(ctx context.Context) GcpCloudCostConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpCloudCostConnectorOutput)
}

// GcpCloudCostConnectorArrayInput is an input type that accepts GcpCloudCostConnectorArray and GcpCloudCostConnectorArrayOutput values.
// You can construct a concrete instance of `GcpCloudCostConnectorArrayInput` via:
//
//	GcpCloudCostConnectorArray{ GcpCloudCostConnectorArgs{...} }
type GcpCloudCostConnectorArrayInput interface {
	pulumi.Input

	ToGcpCloudCostConnectorArrayOutput() GcpCloudCostConnectorArrayOutput
	ToGcpCloudCostConnectorArrayOutputWithContext(context.Context) GcpCloudCostConnectorArrayOutput
}

type GcpCloudCostConnectorArray []GcpCloudCostConnectorInput

func (GcpCloudCostConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpCloudCostConnector)(nil)).Elem()
}

func (i GcpCloudCostConnectorArray) ToGcpCloudCostConnectorArrayOutput() GcpCloudCostConnectorArrayOutput {
	return i.ToGcpCloudCostConnectorArrayOutputWithContext(context.Background())
}

func (i GcpCloudCostConnectorArray) ToGcpCloudCostConnectorArrayOutputWithContext(ctx context.Context) GcpCloudCostConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpCloudCostConnectorArrayOutput)
}

// GcpCloudCostConnectorMapInput is an input type that accepts GcpCloudCostConnectorMap and GcpCloudCostConnectorMapOutput values.
// You can construct a concrete instance of `GcpCloudCostConnectorMapInput` via:
//
//	GcpCloudCostConnectorMap{ "key": GcpCloudCostConnectorArgs{...} }
type GcpCloudCostConnectorMapInput interface {
	pulumi.Input

	ToGcpCloudCostConnectorMapOutput() GcpCloudCostConnectorMapOutput
	ToGcpCloudCostConnectorMapOutputWithContext(context.Context) GcpCloudCostConnectorMapOutput
}

type GcpCloudCostConnectorMap map[string]GcpCloudCostConnectorInput

func (GcpCloudCostConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpCloudCostConnector)(nil)).Elem()
}

func (i GcpCloudCostConnectorMap) ToGcpCloudCostConnectorMapOutput() GcpCloudCostConnectorMapOutput {
	return i.ToGcpCloudCostConnectorMapOutputWithContext(context.Background())
}

func (i GcpCloudCostConnectorMap) ToGcpCloudCostConnectorMapOutputWithContext(ctx context.Context) GcpCloudCostConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GcpCloudCostConnectorMapOutput)
}

type GcpCloudCostConnectorOutput struct{ *pulumi.OutputState }

func (GcpCloudCostConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GcpCloudCostConnector)(nil)).Elem()
}

func (o GcpCloudCostConnectorOutput) ToGcpCloudCostConnectorOutput() GcpCloudCostConnectorOutput {
	return o
}

func (o GcpCloudCostConnectorOutput) ToGcpCloudCostConnectorOutputWithContext(ctx context.Context) GcpCloudCostConnectorOutput {
	return o
}

// Returns billing details.
func (o GcpCloudCostConnectorOutput) BillingExportSpec() GcpCloudCostConnectorBillingExportSpecPtrOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) GcpCloudCostConnectorBillingExportSpecPtrOutput {
		return v.BillingExportSpec
	}).(GcpCloudCostConnectorBillingExportSpecPtrOutput)
}

// Description of the resource.
func (o GcpCloudCostConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates which features to enable among Billing, Optimization, Visibility and Governance.
func (o GcpCloudCostConnectorOutput) FeaturesEnableds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringArrayOutput { return v.FeaturesEnableds }).(pulumi.StringArrayOutput)
}

// GCP Project Id.
func (o GcpCloudCostConnectorOutput) GcpProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringOutput { return v.GcpProjectId }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o GcpCloudCostConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o GcpCloudCostConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o GcpCloudCostConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o GcpCloudCostConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Email corresponding to the Service Account.
func (o GcpCloudCostConnectorOutput) ServiceAccountEmail() pulumi.StringOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringOutput { return v.ServiceAccountEmail }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o GcpCloudCostConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *GcpCloudCostConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type GcpCloudCostConnectorArrayOutput struct{ *pulumi.OutputState }

func (GcpCloudCostConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GcpCloudCostConnector)(nil)).Elem()
}

func (o GcpCloudCostConnectorArrayOutput) ToGcpCloudCostConnectorArrayOutput() GcpCloudCostConnectorArrayOutput {
	return o
}

func (o GcpCloudCostConnectorArrayOutput) ToGcpCloudCostConnectorArrayOutputWithContext(ctx context.Context) GcpCloudCostConnectorArrayOutput {
	return o
}

func (o GcpCloudCostConnectorArrayOutput) Index(i pulumi.IntInput) GcpCloudCostConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GcpCloudCostConnector {
		return vs[0].([]*GcpCloudCostConnector)[vs[1].(int)]
	}).(GcpCloudCostConnectorOutput)
}

type GcpCloudCostConnectorMapOutput struct{ *pulumi.OutputState }

func (GcpCloudCostConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GcpCloudCostConnector)(nil)).Elem()
}

func (o GcpCloudCostConnectorMapOutput) ToGcpCloudCostConnectorMapOutput() GcpCloudCostConnectorMapOutput {
	return o
}

func (o GcpCloudCostConnectorMapOutput) ToGcpCloudCostConnectorMapOutputWithContext(ctx context.Context) GcpCloudCostConnectorMapOutput {
	return o
}

func (o GcpCloudCostConnectorMapOutput) MapIndex(k pulumi.StringInput) GcpCloudCostConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GcpCloudCostConnector {
		return vs[0].(map[string]*GcpCloudCostConnector)[vs[1].(string)]
	}).(GcpCloudCostConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GcpCloudCostConnectorInput)(nil)).Elem(), &GcpCloudCostConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpCloudCostConnectorArrayInput)(nil)).Elem(), GcpCloudCostConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GcpCloudCostConnectorMapInput)(nil)).Elem(), GcpCloudCostConnectorMap{})
	pulumi.RegisterOutputType(GcpCloudCostConnectorOutput{})
	pulumi.RegisterOutputType(GcpCloudCostConnectorArrayOutput{})
	pulumi.RegisterOutputType(GcpCloudCostConnectorMapOutput{})
}
