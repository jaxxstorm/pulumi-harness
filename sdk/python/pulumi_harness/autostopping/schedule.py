# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ScheduleArgs', 'Schedule']

@pulumi.input_type
class ScheduleArgs:
    def __init__(__self__, *,
                 rules: pulumi.Input[Sequence[pulumi.Input[float]]],
                 schedule_type: pulumi.Input[str],
                 time_zone: pulumi.Input[str],
                 ending_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeats: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]] = None,
                 starting_from: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Schedule resource.
        :param pulumi.Input[Sequence[pulumi.Input[float]]] rules: ID of AutoStopping rules on which the schedule applies
        :param pulumi.Input[str] schedule_type: Type of the schedule. Valid values are `uptime` and `downtime`
        :param pulumi.Input[str] time_zone: Time zone in which schedule needs to be executed
        :param pulumi.Input[str] ending_on: Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[str] name: Name of the schedule
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]] repeats: For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        :param pulumi.Input[str] starting_from: Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        pulumi.set(__self__, "rules", rules)
        pulumi.set(__self__, "schedule_type", schedule_type)
        pulumi.set(__self__, "time_zone", time_zone)
        if ending_on is not None:
            pulumi.set(__self__, "ending_on", ending_on)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if repeats is not None:
            pulumi.set(__self__, "repeats", repeats)
        if starting_from is not None:
            pulumi.set(__self__, "starting_from", starting_from)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input[float]]]:
        """
        ID of AutoStopping rules on which the schedule applies
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input[float]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> pulumi.Input[str]:
        """
        Type of the schedule. Valid values are `uptime` and `downtime`
        """
        return pulumi.get(self, "schedule_type")

    @schedule_type.setter
    def schedule_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule_type", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Input[str]:
        """
        Time zone in which schedule needs to be executed
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: pulumi.Input[str]):
        pulumi.set(self, "time_zone", value)

    @property
    @pulumi.getter(name="endingOn")
    def ending_on(self) -> Optional[pulumi.Input[str]]:
        """
        Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "ending_on")

    @ending_on.setter
    def ending_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ending_on", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schedule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def repeats(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]]:
        """
        For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        """
        return pulumi.get(self, "repeats")

    @repeats.setter
    def repeats(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]]):
        pulumi.set(self, "repeats", value)

    @property
    @pulumi.getter(name="startingFrom")
    def starting_from(self) -> Optional[pulumi.Input[str]]:
        """
        Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "starting_from")

    @starting_from.setter
    def starting_from(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "starting_from", value)


@pulumi.input_type
class _ScheduleState:
    def __init__(__self__, *,
                 ending_on: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeats: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[float]]]] = None,
                 schedule_type: Optional[pulumi.Input[str]] = None,
                 starting_from: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Schedule resources.
        :param pulumi.Input[str] ending_on: Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[float] identifier: Unique identifier of the schedule
        :param pulumi.Input[str] name: Name of the schedule
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]] repeats: For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        :param pulumi.Input[Sequence[pulumi.Input[float]]] rules: ID of AutoStopping rules on which the schedule applies
        :param pulumi.Input[str] schedule_type: Type of the schedule. Valid values are `uptime` and `downtime`
        :param pulumi.Input[str] starting_from: Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[str] time_zone: Time zone in which schedule needs to be executed
        """
        if ending_on is not None:
            pulumi.set(__self__, "ending_on", ending_on)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if repeats is not None:
            pulumi.set(__self__, "repeats", repeats)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)
        if schedule_type is not None:
            pulumi.set(__self__, "schedule_type", schedule_type)
        if starting_from is not None:
            pulumi.set(__self__, "starting_from", starting_from)
        if time_zone is not None:
            pulumi.set(__self__, "time_zone", time_zone)

    @property
    @pulumi.getter(name="endingOn")
    def ending_on(self) -> Optional[pulumi.Input[str]]:
        """
        Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "ending_on")

    @ending_on.setter
    def ending_on(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ending_on", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[float]]:
        """
        Unique identifier of the schedule
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[float]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the schedule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def repeats(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]]:
        """
        For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        """
        return pulumi.get(self, "repeats")

    @repeats.setter
    def repeats(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRepeatArgs']]]]):
        pulumi.set(self, "repeats", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[float]]]]:
        """
        ID of AutoStopping rules on which the schedule applies
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[float]]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the schedule. Valid values are `uptime` and `downtime`
        """
        return pulumi.get(self, "schedule_type")

    @schedule_type.setter
    def schedule_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule_type", value)

    @property
    @pulumi.getter(name="startingFrom")
    def starting_from(self) -> Optional[pulumi.Input[str]]:
        """
        Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "starting_from")

    @starting_from.setter
    def starting_from(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "starting_from", value)

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> Optional[pulumi.Input[str]]:
        """
        Time zone in which schedule needs to be executed
        """
        return pulumi.get(self, "time_zone")

    @time_zone.setter
    def time_zone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_zone", value)


class Schedule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ending_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeats: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ScheduleRepeatArgs', 'ScheduleRepeatArgsDict']]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[float]]]] = None,
                 schedule_type: Optional[pulumi.Input[str]] = None,
                 starting_from: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for creating a fixed schedule for Harness AutoStopping rule

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ending_on: Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[str] name: Name of the schedule
        :param pulumi.Input[Sequence[pulumi.Input[Union['ScheduleRepeatArgs', 'ScheduleRepeatArgsDict']]]] repeats: For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        :param pulumi.Input[Sequence[pulumi.Input[float]]] rules: ID of AutoStopping rules on which the schedule applies
        :param pulumi.Input[str] schedule_type: Type of the schedule. Valid values are `uptime` and `downtime`
        :param pulumi.Input[str] starting_from: Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[str] time_zone: Time zone in which schedule needs to be executed
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating a fixed schedule for Harness AutoStopping rule

        :param str resource_name: The name of the resource.
        :param ScheduleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 ending_on: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 repeats: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ScheduleRepeatArgs', 'ScheduleRepeatArgsDict']]]]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[float]]]] = None,
                 schedule_type: Optional[pulumi.Input[str]] = None,
                 starting_from: Optional[pulumi.Input[str]] = None,
                 time_zone: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduleArgs.__new__(ScheduleArgs)

            __props__.__dict__["ending_on"] = ending_on
            __props__.__dict__["name"] = name
            __props__.__dict__["repeats"] = repeats
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
            if schedule_type is None and not opts.urn:
                raise TypeError("Missing required property 'schedule_type'")
            __props__.__dict__["schedule_type"] = schedule_type
            __props__.__dict__["starting_from"] = starting_from
            if time_zone is None and not opts.urn:
                raise TypeError("Missing required property 'time_zone'")
            __props__.__dict__["time_zone"] = time_zone
            __props__.__dict__["identifier"] = None
        super(Schedule, __self__).__init__(
            'harness:autostopping/schedule:Schedule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            ending_on: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[float]] = None,
            name: Optional[pulumi.Input[str]] = None,
            repeats: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ScheduleRepeatArgs', 'ScheduleRepeatArgsDict']]]]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[float]]]] = None,
            schedule_type: Optional[pulumi.Input[str]] = None,
            starting_from: Optional[pulumi.Input[str]] = None,
            time_zone: Optional[pulumi.Input[str]] = None) -> 'Schedule':
        """
        Get an existing Schedule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] ending_on: Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[float] identifier: Unique identifier of the schedule
        :param pulumi.Input[str] name: Name of the schedule
        :param pulumi.Input[Sequence[pulumi.Input[Union['ScheduleRepeatArgs', 'ScheduleRepeatArgsDict']]]] repeats: For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        :param pulumi.Input[Sequence[pulumi.Input[float]]] rules: ID of AutoStopping rules on which the schedule applies
        :param pulumi.Input[str] schedule_type: Type of the schedule. Valid values are `uptime` and `downtime`
        :param pulumi.Input[str] starting_from: Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        :param pulumi.Input[str] time_zone: Time zone in which schedule needs to be executed
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduleState.__new__(_ScheduleState)

        __props__.__dict__["ending_on"] = ending_on
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["repeats"] = repeats
        __props__.__dict__["rules"] = rules
        __props__.__dict__["schedule_type"] = schedule_type
        __props__.__dict__["starting_from"] = starting_from
        __props__.__dict__["time_zone"] = time_zone
        return Schedule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="endingOn")
    def ending_on(self) -> pulumi.Output[Optional[str]]:
        """
        Time until which schedule will be active. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "ending_on")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[float]:
        """
        Unique identifier of the schedule
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the schedule
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def repeats(self) -> pulumi.Output[Optional[Sequence['outputs.ScheduleRepeat']]]:
        """
        For defining periodic schedule. Periodic nature will be applicable from the time of creation of schedule, unless specific 'time_period' is specified
        """
        return pulumi.get(self, "repeats")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence[float]]:
        """
        ID of AutoStopping rules on which the schedule applies
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter(name="scheduleType")
    def schedule_type(self) -> pulumi.Output[str]:
        """
        Type of the schedule. Valid values are `uptime` and `downtime`
        """
        return pulumi.get(self, "schedule_type")

    @property
    @pulumi.getter(name="startingFrom")
    def starting_from(self) -> pulumi.Output[Optional[str]]:
        """
        Time from which schedule will be active. Schedule will take immediate effect if starting_from is not specified. Need to be in YYYY-MM-DD HH:mm:SS format. Eg 2006-01-02 15:04:05
        """
        return pulumi.get(self, "starting_from")

    @property
    @pulumi.getter(name="timeZone")
    def time_zone(self) -> pulumi.Output[str]:
        """
        Time zone in which schedule needs to be executed
        """
        return pulumi.get(self, "time_zone")

