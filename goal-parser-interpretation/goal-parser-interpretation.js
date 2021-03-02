/**
 * @param {string} command
 * @return {string}
 */
var interpret = function(command) {
    return command.replace(/\(al\)/g,'al').replace(/\(\)/g,'o')
};

// \ is used for escaping special charecters.
// / is used for defining a literal.
