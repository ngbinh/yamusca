package yamusca

/** Collection of all useful imports */
object imports {

  type Literal = data.Literal
  val Literal = data.Literal

  type Variable = data.Variable
  val Variable = data.Variable

  type Section = data.Section
  val Section = data.Section

  type Template = data.Template
  val Template = data.Template

  type Context = context.Context
  val Context = context.Context

  type Value = context.Value
  val Value = context.Value

  object mustache {
    def render(t: Template): Context => String =
      expand.renderResult(t)_

    def parse(s: String) =
      parser.parse(s)
  }
}