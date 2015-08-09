def range(x)
  return [] if x.nil?
  (0...x).to_a
end

if __FILE__ == $0
  puts range ARGV[0].to_i
end
