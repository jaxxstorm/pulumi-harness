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

// Resource for creating service account.
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
//			_, err := platform.NewServiceAccount(ctx, "example", &platform.ServiceAccountArgs{
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Email:       pulumi.String("email@service.harness.io"),
//				Description: pulumi.String("test"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				AccountId: pulumi.String("account_id"),
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
// # Import account level service account
//
// ```sh
// $ pulumi import harness:platform/serviceAccount:ServiceAccount example <service_account_id>
// ```
//
// # Import org level service account
//
// ```sh
// $ pulumi import harness:platform/serviceAccount:ServiceAccount example <ord_id>/<service_account_id>
// ```
//
// # Import project level service account
//
// ```sh
// $ pulumi import harness:platform/serviceAccount:ServiceAccount example <org_id>/<project_id>/<service_account_id>
// ```
type ServiceAccount struct {
	pulumi.CustomResourceState

	// Account Identifier for the Entity.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Email of the Service Account.
	Email pulumi.StringOutput `pulumi:"email"`
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

// NewServiceAccount registers a new resource with the given unique name, arguments, and options.
func NewServiceAccount(ctx *pulumi.Context,
	name string, args *ServiceAccountArgs, opts ...pulumi.ResourceOption) (*ServiceAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Email == nil {
		return nil, errors.New("invalid value for required argument 'Email'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceAccount
	err := ctx.RegisterResource("harness:platform/serviceAccount:ServiceAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceAccount gets an existing ServiceAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceAccountState, opts ...pulumi.ResourceOption) (*ServiceAccount, error) {
	var resource ServiceAccount
	err := ctx.ReadResource("harness:platform/serviceAccount:ServiceAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceAccount resources.
type serviceAccountState struct {
	// Account Identifier for the Entity.
	AccountId *string `pulumi:"accountId"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Email of the Service Account.
	Email *string `pulumi:"email"`
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

type ServiceAccountState struct {
	// Account Identifier for the Entity.
	AccountId pulumi.StringPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Email of the Service Account.
	Email pulumi.StringPtrInput
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

func (ServiceAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAccountState)(nil)).Elem()
}

type serviceAccountArgs struct {
	// Account Identifier for the Entity.
	AccountId string `pulumi:"accountId"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Email of the Service Account.
	Email string `pulumi:"email"`
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

// The set of arguments for constructing a ServiceAccount resource.
type ServiceAccountArgs struct {
	// Account Identifier for the Entity.
	AccountId pulumi.StringInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Email of the Service Account.
	Email pulumi.StringInput
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

func (ServiceAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceAccountArgs)(nil)).Elem()
}

type ServiceAccountInput interface {
	pulumi.Input

	ToServiceAccountOutput() ServiceAccountOutput
	ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput
}

func (*ServiceAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAccount)(nil)).Elem()
}

func (i *ServiceAccount) ToServiceAccountOutput() ServiceAccountOutput {
	return i.ToServiceAccountOutputWithContext(context.Background())
}

func (i *ServiceAccount) ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountOutput)
}

// ServiceAccountArrayInput is an input type that accepts ServiceAccountArray and ServiceAccountArrayOutput values.
// You can construct a concrete instance of `ServiceAccountArrayInput` via:
//
//	ServiceAccountArray{ ServiceAccountArgs{...} }
type ServiceAccountArrayInput interface {
	pulumi.Input

	ToServiceAccountArrayOutput() ServiceAccountArrayOutput
	ToServiceAccountArrayOutputWithContext(context.Context) ServiceAccountArrayOutput
}

type ServiceAccountArray []ServiceAccountInput

func (ServiceAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAccount)(nil)).Elem()
}

func (i ServiceAccountArray) ToServiceAccountArrayOutput() ServiceAccountArrayOutput {
	return i.ToServiceAccountArrayOutputWithContext(context.Background())
}

func (i ServiceAccountArray) ToServiceAccountArrayOutputWithContext(ctx context.Context) ServiceAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountArrayOutput)
}

// ServiceAccountMapInput is an input type that accepts ServiceAccountMap and ServiceAccountMapOutput values.
// You can construct a concrete instance of `ServiceAccountMapInput` via:
//
//	ServiceAccountMap{ "key": ServiceAccountArgs{...} }
type ServiceAccountMapInput interface {
	pulumi.Input

	ToServiceAccountMapOutput() ServiceAccountMapOutput
	ToServiceAccountMapOutputWithContext(context.Context) ServiceAccountMapOutput
}

type ServiceAccountMap map[string]ServiceAccountInput

func (ServiceAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAccount)(nil)).Elem()
}

func (i ServiceAccountMap) ToServiceAccountMapOutput() ServiceAccountMapOutput {
	return i.ToServiceAccountMapOutputWithContext(context.Background())
}

func (i ServiceAccountMap) ToServiceAccountMapOutputWithContext(ctx context.Context) ServiceAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceAccountMapOutput)
}

type ServiceAccountOutput struct{ *pulumi.OutputState }

func (ServiceAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountOutput) ToServiceAccountOutput() ServiceAccountOutput {
	return o
}

func (o ServiceAccountOutput) ToServiceAccountOutputWithContext(ctx context.Context) ServiceAccountOutput {
	return o
}

// Account Identifier for the Entity.
func (o ServiceAccountOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Description of the resource.
func (o ServiceAccountOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Email of the Service Account.
func (o ServiceAccountOutput) Email() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.Email }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o ServiceAccountOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o ServiceAccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o ServiceAccountOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o ServiceAccountOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o ServiceAccountOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ServiceAccount) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type ServiceAccountArrayOutput struct{ *pulumi.OutputState }

func (ServiceAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountArrayOutput) ToServiceAccountArrayOutput() ServiceAccountArrayOutput {
	return o
}

func (o ServiceAccountArrayOutput) ToServiceAccountArrayOutputWithContext(ctx context.Context) ServiceAccountArrayOutput {
	return o
}

func (o ServiceAccountArrayOutput) Index(i pulumi.IntInput) ServiceAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceAccount {
		return vs[0].([]*ServiceAccount)[vs[1].(int)]
	}).(ServiceAccountOutput)
}

type ServiceAccountMapOutput struct{ *pulumi.OutputState }

func (ServiceAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceAccount)(nil)).Elem()
}

func (o ServiceAccountMapOutput) ToServiceAccountMapOutput() ServiceAccountMapOutput {
	return o
}

func (o ServiceAccountMapOutput) ToServiceAccountMapOutputWithContext(ctx context.Context) ServiceAccountMapOutput {
	return o
}

func (o ServiceAccountMapOutput) MapIndex(k pulumi.StringInput) ServiceAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceAccount {
		return vs[0].(map[string]*ServiceAccount)[vs[1].(string)]
	}).(ServiceAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountInput)(nil)).Elem(), &ServiceAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountArrayInput)(nil)).Elem(), ServiceAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceAccountMapInput)(nil)).Elem(), ServiceAccountMap{})
	pulumi.RegisterOutputType(ServiceAccountOutput{})
	pulumi.RegisterOutputType(ServiceAccountArrayOutput{})
	pulumi.RegisterOutputType(ServiceAccountMapOutput{})
}
