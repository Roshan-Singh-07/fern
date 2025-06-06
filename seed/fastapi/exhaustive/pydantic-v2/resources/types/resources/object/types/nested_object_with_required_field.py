# This file was auto-generated by Fern from our API Definition.

from ......core.pydantic_utilities import UniversalBaseModel
from .object_with_optional_field import ObjectWithOptionalField
import pydantic
import typing
class NestedObjectWithRequiredField(UniversalBaseModel):
    string: str
    nested_object: ObjectWithOptionalField = pydantic.Field(alias="NestedObject")
    
    model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
