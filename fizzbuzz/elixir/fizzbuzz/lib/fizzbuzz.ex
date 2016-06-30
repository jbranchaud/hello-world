defmodule Fizzbuzz do
  def main(_args) do
    IO.puts "Fizzbuzz"
    IO.puts "--------"
    fizzbuzz
  end

  def fizzbuzz, do: fizzbuzz(1)
  def fizzbuzz(101), do: nil
  def fizzbuzz(n) when rem(n, 15) == 0 do
    IO.puts "FizzBuzz"
    fizzbuzz(n + 1)
  end
  def fizzbuzz(n) when rem(n, 5) == 0 do
    IO.puts "Buzz"
    fizzbuzz(n + 1)
  end
  def fizzbuzz(n) when rem(n, 3) == 0 do
    IO.puts "Fizz"
    fizzbuzz(n + 1)
  end
  def fizzbuzz(n) do
    IO.puts n
    fizzbuzz(n + 1)
  end
end
