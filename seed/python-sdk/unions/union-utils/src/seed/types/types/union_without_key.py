# This file was auto-generated by Fern from our API Definition.

from __future__ import annotations

import typing

import pydantic
import typing_extensions
from ...core.pydantic_utilities import IS_PYDANTIC_V2, UniversalRootModel, update_forward_refs
from .bar import Bar as types_types_bar_Bar
from .foo import Foo as types_types_foo_Foo

T_Result = typing.TypeVar("T_Result")


class _Factory:
    def foo(self, value: types_types_foo_Foo) -> UnionWithoutKey:
        if IS_PYDANTIC_V2:
            return UnionWithoutKey(root=_UnionWithoutKey.Foo(**value.dict(exclude_unset=True), type="foo"))  # type: ignore
        else:
            return UnionWithoutKey(__root__=_UnionWithoutKey.Foo(**value.dict(exclude_unset=True), type="foo"))  # type: ignore

    def bar(self, value: types_types_bar_Bar) -> UnionWithoutKey:
        if IS_PYDANTIC_V2:
            return UnionWithoutKey(root=_UnionWithoutKey.Bar(**value.dict(exclude_unset=True), type="bar"))  # type: ignore
        else:
            return UnionWithoutKey(__root__=_UnionWithoutKey.Bar(**value.dict(exclude_unset=True), type="bar"))  # type: ignore


class UnionWithoutKey(UniversalRootModel):
    """
    Examples
    --------
    from seed.types import UnionWithoutKey_Foo

    UnionWithoutKey_Foo(
        name="example1",
    )
    """

    factory: typing.ClassVar[_Factory] = _Factory()

    if IS_PYDANTIC_V2:
        root: typing_extensions.Annotated[
            typing.Union[_UnionWithoutKey.Foo, _UnionWithoutKey.Bar], pydantic.Field(discriminator="type")
        ]

        def get_as_union(self) -> typing.Union[_UnionWithoutKey.Foo, _UnionWithoutKey.Bar]:
            return self.root
    else:
        __root__: typing_extensions.Annotated[
            typing.Union[_UnionWithoutKey.Foo, _UnionWithoutKey.Bar], pydantic.Field(discriminator="type")
        ]

        def get_as_union(self) -> typing.Union[_UnionWithoutKey.Foo, _UnionWithoutKey.Bar]:
            return self.__root__

    def dict(self, **kwargs: typing.Any) -> typing.Dict[str, typing.Any]:
        if IS_PYDANTIC_V2:
            return self.root.dict(**kwargs)
        else:
            return self.__root__.dict(**kwargs)

    def visit(
        self,
        foo: typing.Callable[[types_types_foo_Foo], T_Result],
        bar: typing.Callable[[types_types_bar_Bar], T_Result],
    ) -> T_Result:
        unioned_value = self.get_as_union()
        if unioned_value.type == "foo":
            return foo(types_types_foo_Foo(**unioned_value.dict(exclude_unset=True, exclude={"type"})))
        if unioned_value.type == "bar":
            return bar(types_types_bar_Bar(**unioned_value.dict(exclude_unset=True, exclude={"type"})))

    if IS_PYDANTIC_V2:
        model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(frozen=True)  # type: ignore # Pydantic v2
    else:

        class Config:
            frozen = True
            smart_union = True


class _UnionWithoutKey:
    class Foo(types_types_foo_Foo):
        type: typing.Literal["foo"] = "foo"

        if IS_PYDANTIC_V2:
            model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(frozen=True)  # type: ignore # Pydantic v2
        else:

            class Config:
                frozen = True
                smart_union = True

    class Bar(types_types_bar_Bar):
        type: typing.Literal["bar"] = "bar"

        if IS_PYDANTIC_V2:
            model_config: typing.ClassVar[pydantic.ConfigDict] = pydantic.ConfigDict(frozen=True)  # type: ignore # Pydantic v2
        else:

            class Config:
                frozen = True
                smart_union = True


update_forward_refs(UnionWithoutKey)
