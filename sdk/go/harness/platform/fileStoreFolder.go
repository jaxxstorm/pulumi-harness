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

// Resource for creating folders in Harness.
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
//			// Create folder
//			_, err := platform.NewFileStoreFolder(ctx, "example", &platform.FileStoreFolderArgs{
//				OrgId:       pulumi.String("org_id"),
//				ProjectId:   pulumi.String("project_id"),
//				Identifier:  pulumi.String("identifier"),
//				Name:        pulumi.String("name"),
//				Description: pulumi.String("description"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//					pulumi.String("baz:qux"),
//				},
//				ParentIdentifier: pulumi.String("parent_identifier"),
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
// # Import account level folder
//
// ```sh
// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <identifier>
// ```
//
// # Import org level folder
//
// ```sh
// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id>/<identifier>
// ```
//
// # Import org level folder
//
// ```sh
// $ pulumi import harness:platform/fileStoreFolder:FileStoreFolder example <org_id>/<project_id>/<identifier>
// ```
type FileStoreFolder struct {
	pulumi.CustomResourceState

	// Created by
	CreatedBies FileStoreFolderCreatedByArrayOutput `pulumi:"createdBies"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Last modified at
	LastModifiedAt pulumi.IntOutput `pulumi:"lastModifiedAt"`
	// Last modified by
	LastModifiedBies FileStoreFolderLastModifiedByArrayOutput `pulumi:"lastModifiedBies"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringOutput `pulumi:"parentIdentifier"`
	// Harness File Store folder path
	Path pulumi.StringOutput `pulumi:"path"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewFileStoreFolder registers a new resource with the given unique name, arguments, and options.
func NewFileStoreFolder(ctx *pulumi.Context,
	name string, args *FileStoreFolderArgs, opts ...pulumi.ResourceOption) (*FileStoreFolder, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ParentIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ParentIdentifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FileStoreFolder
	err := ctx.RegisterResource("harness:platform/fileStoreFolder:FileStoreFolder", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFileStoreFolder gets an existing FileStoreFolder resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFileStoreFolder(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FileStoreFolderState, opts ...pulumi.ResourceOption) (*FileStoreFolder, error) {
	var resource FileStoreFolder
	err := ctx.ReadResource("harness:platform/fileStoreFolder:FileStoreFolder", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FileStoreFolder resources.
type fileStoreFolderState struct {
	// Created by
	CreatedBies []FileStoreFolderCreatedBy `pulumi:"createdBies"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Last modified at
	LastModifiedAt *int `pulumi:"lastModifiedAt"`
	// Last modified by
	LastModifiedBies []FileStoreFolderLastModifiedBy `pulumi:"lastModifiedBies"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier *string `pulumi:"parentIdentifier"`
	// Harness File Store folder path
	Path *string `pulumi:"path"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type FileStoreFolderState struct {
	// Created by
	CreatedBies FileStoreFolderCreatedByArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Last modified at
	LastModifiedAt pulumi.IntPtrInput
	// Last modified by
	LastModifiedBies FileStoreFolderLastModifiedByArrayInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringPtrInput
	// Harness File Store folder path
	Path pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (FileStoreFolderState) ElementType() reflect.Type {
	return reflect.TypeOf((*fileStoreFolderState)(nil)).Elem()
}

type fileStoreFolderArgs struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier string `pulumi:"parentIdentifier"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a FileStoreFolder resource.
type FileStoreFolderArgs struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
	ParentIdentifier pulumi.StringInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (FileStoreFolderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*fileStoreFolderArgs)(nil)).Elem()
}

type FileStoreFolderInput interface {
	pulumi.Input

	ToFileStoreFolderOutput() FileStoreFolderOutput
	ToFileStoreFolderOutputWithContext(ctx context.Context) FileStoreFolderOutput
}

func (*FileStoreFolder) ElementType() reflect.Type {
	return reflect.TypeOf((**FileStoreFolder)(nil)).Elem()
}

func (i *FileStoreFolder) ToFileStoreFolderOutput() FileStoreFolderOutput {
	return i.ToFileStoreFolderOutputWithContext(context.Background())
}

func (i *FileStoreFolder) ToFileStoreFolderOutputWithContext(ctx context.Context) FileStoreFolderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFolderOutput)
}

// FileStoreFolderArrayInput is an input type that accepts FileStoreFolderArray and FileStoreFolderArrayOutput values.
// You can construct a concrete instance of `FileStoreFolderArrayInput` via:
//
//	FileStoreFolderArray{ FileStoreFolderArgs{...} }
type FileStoreFolderArrayInput interface {
	pulumi.Input

	ToFileStoreFolderArrayOutput() FileStoreFolderArrayOutput
	ToFileStoreFolderArrayOutputWithContext(context.Context) FileStoreFolderArrayOutput
}

type FileStoreFolderArray []FileStoreFolderInput

func (FileStoreFolderArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileStoreFolder)(nil)).Elem()
}

func (i FileStoreFolderArray) ToFileStoreFolderArrayOutput() FileStoreFolderArrayOutput {
	return i.ToFileStoreFolderArrayOutputWithContext(context.Background())
}

func (i FileStoreFolderArray) ToFileStoreFolderArrayOutputWithContext(ctx context.Context) FileStoreFolderArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFolderArrayOutput)
}

// FileStoreFolderMapInput is an input type that accepts FileStoreFolderMap and FileStoreFolderMapOutput values.
// You can construct a concrete instance of `FileStoreFolderMapInput` via:
//
//	FileStoreFolderMap{ "key": FileStoreFolderArgs{...} }
type FileStoreFolderMapInput interface {
	pulumi.Input

	ToFileStoreFolderMapOutput() FileStoreFolderMapOutput
	ToFileStoreFolderMapOutputWithContext(context.Context) FileStoreFolderMapOutput
}

type FileStoreFolderMap map[string]FileStoreFolderInput

func (FileStoreFolderMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileStoreFolder)(nil)).Elem()
}

func (i FileStoreFolderMap) ToFileStoreFolderMapOutput() FileStoreFolderMapOutput {
	return i.ToFileStoreFolderMapOutputWithContext(context.Background())
}

func (i FileStoreFolderMap) ToFileStoreFolderMapOutputWithContext(ctx context.Context) FileStoreFolderMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FileStoreFolderMapOutput)
}

type FileStoreFolderOutput struct{ *pulumi.OutputState }

func (FileStoreFolderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FileStoreFolder)(nil)).Elem()
}

func (o FileStoreFolderOutput) ToFileStoreFolderOutput() FileStoreFolderOutput {
	return o
}

func (o FileStoreFolderOutput) ToFileStoreFolderOutputWithContext(ctx context.Context) FileStoreFolderOutput {
	return o
}

// Created by
func (o FileStoreFolderOutput) CreatedBies() FileStoreFolderCreatedByArrayOutput {
	return o.ApplyT(func(v *FileStoreFolder) FileStoreFolderCreatedByArrayOutput { return v.CreatedBies }).(FileStoreFolderCreatedByArrayOutput)
}

// Description of the resource.
func (o FileStoreFolderOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o FileStoreFolderOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Last modified at
func (o FileStoreFolderOutput) LastModifiedAt() pulumi.IntOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.IntOutput { return v.LastModifiedAt }).(pulumi.IntOutput)
}

// Last modified by
func (o FileStoreFolderOutput) LastModifiedBies() FileStoreFolderLastModifiedByArrayOutput {
	return o.ApplyT(func(v *FileStoreFolder) FileStoreFolderLastModifiedByArrayOutput { return v.LastModifiedBies }).(FileStoreFolderLastModifiedByArrayOutput)
}

// Name of the resource.
func (o FileStoreFolderOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o FileStoreFolderOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Folder parent identifier on Harness File Store. If the file is at the root level, the parentIdentifier will be `Root`.
func (o FileStoreFolderOutput) ParentIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringOutput { return v.ParentIdentifier }).(pulumi.StringOutput)
}

// Harness File Store folder path
func (o FileStoreFolderOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o FileStoreFolderOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o FileStoreFolderOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *FileStoreFolder) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type FileStoreFolderArrayOutput struct{ *pulumi.OutputState }

func (FileStoreFolderArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FileStoreFolder)(nil)).Elem()
}

func (o FileStoreFolderArrayOutput) ToFileStoreFolderArrayOutput() FileStoreFolderArrayOutput {
	return o
}

func (o FileStoreFolderArrayOutput) ToFileStoreFolderArrayOutputWithContext(ctx context.Context) FileStoreFolderArrayOutput {
	return o
}

func (o FileStoreFolderArrayOutput) Index(i pulumi.IntInput) FileStoreFolderOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FileStoreFolder {
		return vs[0].([]*FileStoreFolder)[vs[1].(int)]
	}).(FileStoreFolderOutput)
}

type FileStoreFolderMapOutput struct{ *pulumi.OutputState }

func (FileStoreFolderMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FileStoreFolder)(nil)).Elem()
}

func (o FileStoreFolderMapOutput) ToFileStoreFolderMapOutput() FileStoreFolderMapOutput {
	return o
}

func (o FileStoreFolderMapOutput) ToFileStoreFolderMapOutputWithContext(ctx context.Context) FileStoreFolderMapOutput {
	return o
}

func (o FileStoreFolderMapOutput) MapIndex(k pulumi.StringInput) FileStoreFolderOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FileStoreFolder {
		return vs[0].(map[string]*FileStoreFolder)[vs[1].(string)]
	}).(FileStoreFolderOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFolderInput)(nil)).Elem(), &FileStoreFolder{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFolderArrayInput)(nil)).Elem(), FileStoreFolderArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FileStoreFolderMapInput)(nil)).Elem(), FileStoreFolderMap{})
	pulumi.RegisterOutputType(FileStoreFolderOutput{})
	pulumi.RegisterOutputType(FileStoreFolderArrayOutput{})
	pulumi.RegisterOutputType(FileStoreFolderMapOutput{})
}
