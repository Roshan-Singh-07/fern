# This file was auto-generated by Fern from our API Definition.

from .docs import Docs
from ..core.pydantic_utilities import IS_PYDANTIC_V2
import typing
import pydantic
class ExampleType(Docs):
    """
    Examples
    --------
    from seed.extends import ExampleType
    
    ExampleType(
        docs="This is an example type.",
        name="Example",
    )
    """
    name: str
    
    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(extra="forbid")  # type: ignore # Pydantic v2
    else:
        class Config:
            extra = pydantic.Extra.forbid
