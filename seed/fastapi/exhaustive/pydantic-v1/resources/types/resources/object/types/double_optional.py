# This file was auto-generated by Fern from our API Definition.

from ......core.pydantic_utilities import UniversalBaseModel
import typing
from .optional_alias import OptionalAlias
import pydantic
class DoubleOptional(UniversalBaseModel):
    optional_alias: typing.Optional[OptionalAlias] = pydantic.Field(alias="optionalAlias", default=None)
    
    class Config:
        extra = pydantic.Extra.forbid
