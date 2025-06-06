# This file was auto-generated by Fern from our API Definition.

from ..core.pydantic_utilities import UniversalBaseModel
from .type_id import TypeId
from ..core.pydantic_utilities import IS_PYDANTIC_V2
import typing
import pydantic
class Type(UniversalBaseModel):
    """
    A simple type with just a name.
    
    Examples
    --------
    from seed.alias import Type
    
    Type(
        id="type-df89sdg1",
        name="foo",
    )
    """
    id: TypeId
    name: str
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
