# This file was auto-generated by Fern from our API Definition.

from ....core.pydantic_utilities import UniversalBaseModel
import typing
from .my_union import MyUnion
import pydantic
from ....core.pydantic_utilities import IS_PYDANTIC_V2
class TypeWithOptionalUnion(UniversalBaseModel):
    my_union: typing.Optional[MyUnion] = pydantic.Field(alias="myUnion", default=None)
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
