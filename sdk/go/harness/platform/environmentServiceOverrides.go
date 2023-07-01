// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Harness environment service overrides.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.NewEnvironmentServiceOverrides(ctx, "example", &platform.EnvironmentServiceOverridesArgs{
//				EnvId:     pulumi.String("environmentIdentifier"),
//				OrgId:     pulumi.String("orgIdentifier"),
//				ProjectId: pulumi.String("projectIdentifier"),
//				ServiceId: pulumi.String("serviceIdentifier"),
//				Yaml: pulumi.String(`        serviceOverrides:
//	          environmentRef: environmentIdentifier
//	          serviceRef: serviceIdentifier
//	          variables:
//	           - name: asda
//	             type: String
//	             value: asddad
//	          manifests:
//	             - manifest:
//	                 identifier: manifestEnv
//	                 type: Values
//	                 spec:
//	                   store:
//	                     type: Git
//	                     spec:
//	                       connectorRef: <+input>
//	                       gitFetchType: Branch
//	                       paths:
//	                         - file1
//	                       repoName: <+input>
//	                       branch: master
//	          configFiles:
//	             - configFile:
//	                 identifier: configFileEnv
//	                 spec:
//	                   store:
//	                     type: Harness
//	                     spec:
//	                       files:
//	                         - account:/Add-ons/svcOverrideTest
//	                       secretFiles: []
//
// `),
//
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
// # Import using serviceoverride id
//
// ```sh
//
//	$ pulumi import harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides example <serviceoverride_id>
//
// ```
type EnvironmentServiceOverrides struct {
	pulumi.CustomResourceState

	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId pulumi.StringOutput `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
	// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringOutput `pulumi:"yaml"`
}

// NewEnvironmentServiceOverrides registers a new resource with the given unique name, arguments, and options.
func NewEnvironmentServiceOverrides(ctx *pulumi.Context,
	name string, args *EnvironmentServiceOverridesArgs, opts ...pulumi.ResourceOption) (*EnvironmentServiceOverrides, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvId == nil {
		return nil, errors.New("invalid value for required argument 'EnvId'")
	}
	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	if args.Yaml == nil {
		return nil, errors.New("invalid value for required argument 'Yaml'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource EnvironmentServiceOverrides
	err := ctx.RegisterResource("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEnvironmentServiceOverrides gets an existing EnvironmentServiceOverrides resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEnvironmentServiceOverrides(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EnvironmentServiceOverridesState, opts ...pulumi.ResourceOption) (*EnvironmentServiceOverrides, error) {
	var resource EnvironmentServiceOverrides
	err := ctx.ReadResource("harness:platform/environmentServiceOverrides:EnvironmentServiceOverrides", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EnvironmentServiceOverrides resources.
type environmentServiceOverridesState struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId *string `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier *string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId *string `pulumi:"serviceId"`
	// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml *string `pulumi:"yaml"`
}

type EnvironmentServiceOverridesState struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId pulumi.StringPtrInput
	// identifier of the service overrides.
	Identifier pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId pulumi.StringPtrInput
	// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringPtrInput
}

func (EnvironmentServiceOverridesState) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentServiceOverridesState)(nil)).Elem()
}

type environmentServiceOverridesArgs struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId string `pulumi:"envId"`
	// identifier of the service overrides.
	Identifier *string `pulumi:"identifier"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId string `pulumi:"serviceId"`
	// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml string `pulumi:"yaml"`
}

// The set of arguments for constructing a EnvironmentServiceOverrides resource.
type EnvironmentServiceOverridesArgs struct {
	// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
	EnvId pulumi.StringInput
	// identifier of the service overrides.
	Identifier pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
	ServiceId pulumi.StringInput
	// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
	Yaml pulumi.StringInput
}

func (EnvironmentServiceOverridesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*environmentServiceOverridesArgs)(nil)).Elem()
}

type EnvironmentServiceOverridesInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput
	ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput
}

func (*EnvironmentServiceOverrides) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentServiceOverrides)(nil)).Elem()
}

func (i *EnvironmentServiceOverrides) ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput {
	return i.ToEnvironmentServiceOverridesOutputWithContext(context.Background())
}

func (i *EnvironmentServiceOverrides) ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesOutput)
}

// EnvironmentServiceOverridesArrayInput is an input type that accepts EnvironmentServiceOverridesArray and EnvironmentServiceOverridesArrayOutput values.
// You can construct a concrete instance of `EnvironmentServiceOverridesArrayInput` via:
//
//	EnvironmentServiceOverridesArray{ EnvironmentServiceOverridesArgs{...} }
type EnvironmentServiceOverridesArrayInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput
	ToEnvironmentServiceOverridesArrayOutputWithContext(context.Context) EnvironmentServiceOverridesArrayOutput
}

type EnvironmentServiceOverridesArray []EnvironmentServiceOverridesInput

func (EnvironmentServiceOverridesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (i EnvironmentServiceOverridesArray) ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput {
	return i.ToEnvironmentServiceOverridesArrayOutputWithContext(context.Background())
}

func (i EnvironmentServiceOverridesArray) ToEnvironmentServiceOverridesArrayOutputWithContext(ctx context.Context) EnvironmentServiceOverridesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesArrayOutput)
}

// EnvironmentServiceOverridesMapInput is an input type that accepts EnvironmentServiceOverridesMap and EnvironmentServiceOverridesMapOutput values.
// You can construct a concrete instance of `EnvironmentServiceOverridesMapInput` via:
//
//	EnvironmentServiceOverridesMap{ "key": EnvironmentServiceOverridesArgs{...} }
type EnvironmentServiceOverridesMapInput interface {
	pulumi.Input

	ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput
	ToEnvironmentServiceOverridesMapOutputWithContext(context.Context) EnvironmentServiceOverridesMapOutput
}

type EnvironmentServiceOverridesMap map[string]EnvironmentServiceOverridesInput

func (EnvironmentServiceOverridesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (i EnvironmentServiceOverridesMap) ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput {
	return i.ToEnvironmentServiceOverridesMapOutputWithContext(context.Background())
}

func (i EnvironmentServiceOverridesMap) ToEnvironmentServiceOverridesMapOutputWithContext(ctx context.Context) EnvironmentServiceOverridesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EnvironmentServiceOverridesMapOutput)
}

type EnvironmentServiceOverridesOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesOutput) ToEnvironmentServiceOverridesOutput() EnvironmentServiceOverridesOutput {
	return o
}

func (o EnvironmentServiceOverridesOutput) ToEnvironmentServiceOverridesOutputWithContext(ctx context.Context) EnvironmentServiceOverridesOutput {
	return o
}

// The env Id associated with the overrides. To reference an environment at the organization scope, prefix 'org' to the expression: org.{env*id}. To reference an environment at the account scope, prefix 'account' to the expression: account.{env*id}).
func (o EnvironmentServiceOverridesOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.EnvId }).(pulumi.StringOutput)
}

// identifier of the service overrides.
func (o EnvironmentServiceOverridesOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o EnvironmentServiceOverridesOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o EnvironmentServiceOverridesOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The service Id associated with the overrides. To reference a service at the organization scope, prefix 'org' to the expression: org.{service*id}. To reference a service at the account scope, prefix 'account' to the expression: account.{service*id}).
func (o EnvironmentServiceOverridesOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

// Environment Service Overrides YAML. In YAML, to reference an entity at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference an entity at the account scope, prefix 'account` to the expression: account.{identifier}. For eg, to reference a connector with identifier 'connectorId' at the organization scope in a stage mention it as connectorRef: org.connectorId.
func (o EnvironmentServiceOverridesOutput) Yaml() pulumi.StringOutput {
	return o.ApplyT(func(v *EnvironmentServiceOverrides) pulumi.StringOutput { return v.Yaml }).(pulumi.StringOutput)
}

type EnvironmentServiceOverridesArrayOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesArrayOutput) ToEnvironmentServiceOverridesArrayOutput() EnvironmentServiceOverridesArrayOutput {
	return o
}

func (o EnvironmentServiceOverridesArrayOutput) ToEnvironmentServiceOverridesArrayOutputWithContext(ctx context.Context) EnvironmentServiceOverridesArrayOutput {
	return o
}

func (o EnvironmentServiceOverridesArrayOutput) Index(i pulumi.IntInput) EnvironmentServiceOverridesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EnvironmentServiceOverrides {
		return vs[0].([]*EnvironmentServiceOverrides)[vs[1].(int)]
	}).(EnvironmentServiceOverridesOutput)
}

type EnvironmentServiceOverridesMapOutput struct{ *pulumi.OutputState }

func (EnvironmentServiceOverridesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EnvironmentServiceOverrides)(nil)).Elem()
}

func (o EnvironmentServiceOverridesMapOutput) ToEnvironmentServiceOverridesMapOutput() EnvironmentServiceOverridesMapOutput {
	return o
}

func (o EnvironmentServiceOverridesMapOutput) ToEnvironmentServiceOverridesMapOutputWithContext(ctx context.Context) EnvironmentServiceOverridesMapOutput {
	return o
}

func (o EnvironmentServiceOverridesMapOutput) MapIndex(k pulumi.StringInput) EnvironmentServiceOverridesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EnvironmentServiceOverrides {
		return vs[0].(map[string]*EnvironmentServiceOverrides)[vs[1].(string)]
	}).(EnvironmentServiceOverridesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesInput)(nil)).Elem(), &EnvironmentServiceOverrides{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesArrayInput)(nil)).Elem(), EnvironmentServiceOverridesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EnvironmentServiceOverridesMapInput)(nil)).Elem(), EnvironmentServiceOverridesMap{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesOutput{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesArrayOutput{})
	pulumi.RegisterOutputType(EnvironmentServiceOverridesMapOutput{})
}
