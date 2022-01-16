import json
import os.path

print("Tool options are pickaxe, axe, shovel, and hoe.")
breakTool = input("Enter the tool used to break the block: ")
print("Tool tier options are stone, iron, and diamond.")
breakTier = input("Enter the tier of tool used to break the block: ")
blockName = "blockcompression:" + input("Enter blockname: ")

parentDir = "C:\\Users\\Nikhil Turlapati\\Documents\\block-compression\\src\\main\\resources\\data\\minecraft" \
            "\\tags\\blocks"

if breakTool == "pickaxe":
    pickDir = os.path.join(parentDir, "mineable\\pickaxe.json")

    with open(pickDir, 'r') as j:
        config = json.load(j)
    config["values"].append(blockName)
    with open(pickDir, 'w') as j:
        json.dump(config, j)

    if breakTier == "stone":
        stoneDir = os.path.join(parentDir, "needs_stone_tool.json")

        with open(stoneDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(stoneDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "iron":
        ironDir = os.path.join(parentDir, "needs_iron_tool.json")

        with open(ironDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(ironDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "diamond":
        diamondDir = os.path.join(parentDir, "needs_diamond_tool.json")

        with open(diamondDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(diamondDir, 'w') as j:
            json.dump(config, j)
    else:
        print("Wrong option entered.")
        quit()
elif breakTool == "axe":
    axeDir = os.path.join(parentDir, "mineable\\axe.json")

    with open(axeDir, 'r') as j:
        config = json.load(j)
    config["values"].append(blockName)
    with open(axeDir, 'w') as j:
        json.dump(config, j)

    if breakTier == "stone":
        stoneDir = os.path.join(parentDir, "needs_stone_tool.json")

        with open(stoneDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(stoneDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "iron":
        ironDir = os.path.join(parentDir, "needs_iron_tool.json")

        with open(ironDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(ironDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "diamond":
        diamondDir = os.path.join(parentDir, "needs_diamond_tool.json")

        with open(diamondDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(diamondDir, 'w') as j:
            json.dump(config, j)
    else:
        print("Wrong option entered.")
        quit()
elif breakTool == "shovel":
    shovelDir = os.path.join(parentDir, "mineable\\shovel.json")

    with open(shovelDir, 'r') as j:
        config = json.load(j)
    config["values"].append(blockName)
    with open(shovelDir, 'w') as j:
        json.dump(config, j)

    if breakTier == "stone":
        stoneDir = os.path.join(parentDir, "needs_stone_tool.json")

        with open(stoneDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(stoneDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "iron":
        ironDir = os.path.join(parentDir, "needs_iron_tool.json")

        with open(ironDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(ironDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "diamond":
        diamondDir = os.path.join(parentDir, "needs_diamond_tool.json")

        with open(diamondDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(diamondDir, 'w') as j:
            json.dump(config, j)
    else:
        print("Wrong option entered.")
        quit()
elif breakTool == "hoe":
    hoeDir = os.path.join(parentDir, "mineable\\hoe.json")

    with open(hoeDir, 'r') as j:
        config = json.load(j)
    config["values"].append(blockName)
    with open(hoeDir, 'w') as j:
        json.dump(config, j)

    if breakTier == "stone":
        stoneDir = os.path.join(parentDir, "needs_stone_tool.json")

        with open(stoneDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(stoneDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "iron":
        ironDir = os.path.join(parentDir, "needs_iron_tool.json")

        with open(ironDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(ironDir, 'w') as j:
            json.dump(config, j)
    elif breakTier == "diamond":
        diamondDir = os.path.join(parentDir, "needs_diamond_tool.json")

        with open(diamondDir, 'r') as j:
            config = json.load(j)
        config["values"].append(blockName)
        with open(diamondDir, 'w') as j:
            json.dump(config, j)
    else:
        print("Wrong option entered.")
        quit()
else:
    print("Wrong option entered.")
    quit()
